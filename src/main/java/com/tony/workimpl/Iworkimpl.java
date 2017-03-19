package com.tony.workimpl;

import com.tony.runImpl.Irunimpl;
import com.tony.work.Iwork;

/**
 * Created by Tony on 2017/3/4.
 */
public class Iworkimpl extends Irunimpl implements Iwork {
        private String sql;

        //无参构造函数
        public Iworkimpl(){
            setSql("测试查询");
        }

        //有参构造函数
        public Iworkimpl(String sql){
            setSql(sql);
        }

        //@Override
        public void WriteSql(){
            runSql(this.sql);
        }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
