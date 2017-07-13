package svr.tony.dao;

import org.springframework.stereotype.Repository;
import svr.tony.model.emp;

import java.util.List;
import java.util.Map;

/**
 * Created by user on 2017/4/4.
 */
public interface empdao {
    List<Map<String,Object>> Listall();

}
