package com.tony.dataserver;


/**
 * Created by Tony on 2017/3/4.
 */
public class ConnFactory {
    public Iconn getconn(String connType){
        if(connType == null) {
            return null;
        }


        if(connType.equalsIgnoreCase("sql")){
            return new IconnsqlserverImpl();
        }else {
            return null;
        }
    }
}
