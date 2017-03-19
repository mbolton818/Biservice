package com.tony.dataserver;

/**
 * Created by Tony on 2017/3/4.
 */
public class IconnsqlserverImpl extends AbstractConn{
    private String connstr;
    private String host;


    public IconnsqlserverImpl(){
        this.host = "127.0.0.1";
        this.connstr = "连接"+ host +"sql成功";
    }

    public String getDataConn() {
        return connstr;
    }
}
