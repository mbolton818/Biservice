package svr.tony.service;

import svr.tony.model.emp;

import java.util.List;
import java.util.Map;

/**
 * Created by user on 2017/4/4.
 */
public interface empservice {
    List<Map<String,Object>> getEmpall();

}
