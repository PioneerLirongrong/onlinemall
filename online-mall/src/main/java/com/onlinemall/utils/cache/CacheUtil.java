package com.onlinemall.utils.cache;

import com.onlinemall.utils.properties.EnvironmentUtil;
import org.apache.log4j.Logger;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 缓存的工具类
 *
 * @author lr
 */
public class CacheUtil {

    public static Logger logger = Logger.getLogger(CacheUtil.class);
    public static JedisPool pool = null;
    public static String REDIS_SERVER_ADDRESS;
    public static int REDIS_SERVER_PORT;
    public static String REDIS_MEMORY;
    /**
     maxActive
     控制池中对象的最大数量。默认值是8，如果是负值表示没限制。
     maxIdle
     控制池中空闲的对象的最大数量。默认值是8，如果是负值表示没限制。
     minIdle
     控制池中空闲的对象的最小数量。默认值是0。
     whenExhaustedAction
     指定池中对象被消耗完以后的行为，有下面这些选择：
     >> WHEN_EXHAUSTED_FAIL		0
     >> WHEN_EXHAUSTED_GROW		2
     >> WHEN_EXHAUSTED_BLOCK		1
     */
    static {
        init();
    }
    /**
     * 初始化redis的连接池
     */
    public static void init() {
        EnvironmentUtil env = new EnvironmentUtil("redis-db.properties");
        REDIS_SERVER_ADDRESS = env.getPropertyValue("redis-server-address");
        REDIS_SERVER_PORT = Integer.valueOf(env.getPropertyValue("redis-server-prot"));
        REDIS_MEMORY = env.getPropertyValue("redis-memory");
        //初始化连接池
        JedisPoolConfig config = new JedisPoolConfig();
        //控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；
        //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例。
        config.setMaxIdle(100);
        //表示当borrow(引入)一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；
        config.setMaxWaitMillis(1000 * 30);
        config.setMaxTotal(1000);
        pool = new JedisPool(config, REDIS_SERVER_ADDRESS, REDIS_SERVER_PORT);
    }

    public CacheUtil() {
    }

    /**
     * 回收redis的链接
     * @param jedis
     */
    public static void recoverJedis(Jedis jedis) {
        pool.returnResourceObject(jedis);
    }

    /**
     * 检测key是否存在
     * @param key
     * @return
     */
    public static boolean exists(String key) {
        Jedis jedis = pool.getResource();
        boolean exists = jedis.exists(key);
        recoverJedis(jedis);
        return exists;
    }

    /**
     * 存入key对应的map(k-V)
     * @param key
     * @param hash
     * @return
     */
    public static String hmset(String key, Map<String, String> hash) {
        Jedis jedis = pool.getResource();
        String value = jedis.hmset(key, hash);
        recoverJedis(jedis);
        return value;
    }

    /**
     * 获取key对应的value
     * @param key
     * @return
     */
    public static String get(String key) {
        Jedis jedis = pool.getResource();
        String value = jedis.get(key);
        recoverJedis(jedis);
        return value;
    }

    /**
     * 获取key对应的list
     * @param key
     * @return
     */
    public static List<String> lrange(String key) {
        Jedis jedis = pool.getResource();
        Long length = jedis.llen(key);
        List<String> value = jedis.lrange(key, 0, -1);
        recoverJedis(jedis);
        return value;
    }

    /**
     * 往key对应的list赋值
     * @param key
     * @param data
     * @return
     */
    public static Long lpush(String key, String data) {
        Jedis jedis = pool.getResource();
        Long value = jedis.lpush(key, data);
        recoverJedis(jedis);
        return value;
    }

    /**
     * 获取key对应map的value值
     * @param key
     * @param field
     * @return
     */
    public static String hget(String key, String field) {
        Jedis jedis = pool.getResource();
        String value = jedis.hget(key, field);
        recoverJedis(jedis);
        return value;
    }

    /**
     * 判断key对应的map的key的值是否存在
     * @param key
     * @param field
     * @return
     */
    public static Boolean hexists(String key, String field) {
        Jedis jedis = pool.getResource();
        Boolean value = jedis.hexists(key, field);
        recoverJedis(jedis);
        return value;
    }

    /**
     * 删除key对应map的value
     * @param key
     * @param field
     * @return
     */
    public static Long hdel(String key, String field) {
        Jedis jedis = pool.getResource();
        Long value = jedis.hdel(key, field);
        recoverJedis(jedis);
        return value;
    }

    /**
     * 设置key对应的set
     * @param key
     * @param field
     * @param value
     * @return
     */
    public static Long hset(String key, String field, String value) {
        Jedis jedis = pool.getResource();
        Long result = jedis.hset(key, field, value);
        recoverJedis(jedis);
        return result;
    }

    /**
     *  获取keys
     * @param key
     * @return
     */
    public static Set<String> hkeys(String key) {
        Jedis jedis = pool.getResource();
        Set<String> value = jedis.hkeys(key);
        recoverJedis(jedis);
        return value;
    }

    /**
     *
     * @param key
     * @return
     */
    public static Set<String> hvals(String key) {
        Jedis jedis = pool.getResource();
        Set<String> value = (Set<String>) jedis.hvals(key);
        recoverJedis(jedis);
        return value;
    }

    /**
     * 获取key对应的map
     * @param key
     * @return
     */
    public static Map<String, String> hgetAll(String key) {
        Jedis jedis = pool.getResource();
        Map<String, String> value = jedis.hgetAll(key);
        recoverJedis(jedis);
        return value;
    }

    /**
     * 获取key对应的set
     * @param pattern
     * @return
     */
    public static Set<String> keys(String pattern) {
        Jedis jedis = pool.getResource();
        Set<String> value = jedis.keys(pattern);
        recoverJedis(jedis);
        return value;
    }

    /**
     *  存入某一个key对应的value
     * @param key
     * @param value
     */
    public static void set(String key, String value) {
        Jedis jedis = pool.getResource();
        jedis.set(key, value);
        recoverJedis(jedis);
    }

    /**
     *  存入key对应的list
     * @param listname
     * @param list
     */
    public void setList(String listname, List<String> list) {
        Jedis jedis = pool.getResource();
        for (String item : list) {
            jedis.lpush(listname, item);
        }
        recoverJedis(jedis);
    }

    /**
     * 获取key对应的list
     * @param listname
     * @return
     */
    public List<String> getList(String listname) {
        Jedis jedis = pool.getResource();
        List<String> value = jedis.lrange(listname, 0, -1);
        recoverJedis(jedis);
        return value;
    }

    /**
     * 获取内存的使用量
     * @return
     */
    public static float getMemoryUsed() {
        Jedis jedis = pool.getResource();
        System.out.println(jedis.info(REDIS_MEMORY));
        String[] line = jedis.info(REDIS_MEMORY).split("\n");
        String used_memory = line[1].split(":")[1];
        System.out.println("used_memory : " + used_memory);
        recoverJedis(jedis);
        return Float.parseFloat(used_memory) / 1024;
    }

    /**
     * 给某个key的value值加
     * @param key
     */
    public static void incr(String key) {
        Jedis jedis = pool.getResource();
        jedis.incr(key);
        recoverJedis(jedis);
    }

    /**
     * 给某个key的value减值
     * @param key
     */
    public static void decr(String key) {
        Jedis jedis = pool.getResource();
        jedis.decr(key);
        recoverJedis(jedis);
    }

    /**
     * 删除key对应的value
     * @param key
     */
    public static void clear(String key) {
        Jedis jedis = pool.getResource();
        jedis.del(key);
        recoverJedis(jedis);
    }

    /**
     * 删除缓存的所有数据
     */
    public static void clear() {
        Jedis jedis = pool.getResource();
        jedis.flushAll();
        recoverJedis(jedis);
    }
}
