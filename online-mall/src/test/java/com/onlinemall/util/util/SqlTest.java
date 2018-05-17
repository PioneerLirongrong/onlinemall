package com.onlinemall.util.util;

import com.onlinemall.param.request.RequestParams;
import com.onlinemall.utils.jdbcUtil.SqlUtil;
import org.junit.Test;

/**
 * @author lrr
 */
public class SqlTest {
    RequestParams params;

    @Test
    public void testSql(){
        params = new RequestParams();
        params.getParams().put("sex","1");
        params.getParams().put("mail","750136676@qq.com");
        String s = SqlUtil.MakeSql("select * from user", params.getParams());
        System.out.println(s);
    }
}
