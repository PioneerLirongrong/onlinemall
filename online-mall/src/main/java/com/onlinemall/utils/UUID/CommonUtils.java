package com.onlinemall.utils.UUID;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {

    private static Random random = new Random();

    private static final String DateFormat_YYYY_MM_DD = "yyyy-MM-dd";

    private static final String DateFormat_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /**
     * 根据时间戳生成一个唯一整数ID
     */
    public static long createId() {
        return Long.parseLong(String.format("%d%03d", System.currentTimeMillis() % 1000000000000L, Thread.currentThread().getId()));
    }

    /**
     * 生成一个纯字符串的UUID
     */
    public static String createUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 检测手机号是否合法
     */
    public static boolean checkValidPhone(String phone) {
        String regPhone = "^\\d{8,15}$";
        Pattern p = Pattern.compile(regPhone);
        Matcher m = p.matcher(phone);
        return m.matches();
    }

    /**
     * 检测邮箱是否合法
     */
    public static boolean checkValidEmail(String email) {
        String regEmail = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        Pattern p = Pattern.compile(regEmail);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * 生成一个指定长度的字符串
     */
    public static String genRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYAC0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(base.charAt(random.nextInt(base.length())));
        }
        return sb.toString();
    }

    /**
     * 对字符串做MD5加密
     */
    public static String getMD5(String str) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            return new BigInteger(1, md.digest()).toString(32);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 将某个日期增加指定天数，并返回结果。如果传入负数，则为减。
     *
     * @param date    要操作的日期对象
     * @param ammount 要增加天数
     * @return 结果日期对象
     */
    public static Date addDate(final Date date, final int ammount) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, ammount);
        return c.getTime();
    }

    /**
     * 获取某个时间点当天零点的时间戳
     */
    public static Long getDayTime(Long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(time));
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTimeInMillis();
    }

    /**
     * 日期类型装换 2019-02-03
     */
    public static Date stringSingleToDate(String date) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat_YYYY_MM_DD);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return simpleDateFormat.parse(date);

    }

    /**
     * 日期类型装换 2019-02-03
     */
    public static String dateSingleToString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat_YYYY_MM_DD);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return simpleDateFormat.format(date);
    }

    /**
     * 日期类型装换 2019-02-03
     */
    public static String dateTimeSingleToString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat_YYYY_MM_DD_HH_MM_SS);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return simpleDateFormat.format(date);
    }

    /**
     * 日期类型装换 2019-02-03 01:32:23
     */
    public static Date stringSingleToDateTime(String date) throws Exception {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat_YYYY_MM_DD_HH_MM_SS);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return simpleDateFormat.parse(date);

    }

    /**
     * date2比date1多的天数
     */
    public static int differentDays(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        int day1 = cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);

        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if (year1 != year2) //同一年
        {
            int timeDistance = 0;
            for (int i = year1; i < year2; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) //闰年
                {
                    timeDistance += 366;
                } else //不是闰年
                {
                    timeDistance += 365;
                }
            }

            return timeDistance + (day2 - day1);
        } else {
            return day2 - day1;
        }
    }
}
