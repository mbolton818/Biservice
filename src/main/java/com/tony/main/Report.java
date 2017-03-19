package com.tony.main;

import com.tony.dataserver.Iconn;
import com.tony.workimpl.IworkRegOfDayimpl;
import com.tony.workimpl.Iworkimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Tony on 2017/3/4.
 */
public class Report {
        public static void main(String[] args){

            Iworkimpl s1 = new Iworkimpl();
            Iconn c1 = s1.getconn("sql");

            if(c1 ==  null){
                System.out.println("null");
            }else{
                System.out.println(c1.getDataConn());
            }
            s1.WriteSql();


            Iworkimpl s2 = new IworkRegOfDayimpl();
            s2.WriteSql();

            ApplicationContext ctx= new ClassPathXmlApplicationContext("ApplicationContext.xml");

            Iworkimpl s3 = (Iworkimpl) ctx.getBean("Report");

//            Iworkimpl s3 = ctx.getBean(Iworkimpl.class);

            s3.WriteSql();
        }


}
