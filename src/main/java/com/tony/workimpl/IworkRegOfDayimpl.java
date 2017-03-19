package com.tony.workimpl;

/**
 * Created by Tony on 2017/3/4.
 */
public class IworkRegOfDayimpl extends Iworkimpl {


    @Override
    public void WriteSql() {
        setSql("每日记上");
        runSql(getSql());
    }
}
