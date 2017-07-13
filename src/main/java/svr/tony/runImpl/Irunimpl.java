package svr.tony.runImpl;

import svr.tony.dataserver.ConnFactory;
import svr.tony.run.Irun;

/**
 * Created by Tony on 2017/3/4.
 */
public class Irunimpl extends ConnFactory implements Irun {
    public boolean runSql(String sql){
        System.out.println("已成功执行" + sql);
        return true;
    }
}
