package svr.tony.service.impl;

import svr.tony.dao.empdao;
import svr.tony.model.emp;
import svr.tony.service.empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by user on 2017/4/4.
 */
@Service
public class empserviceImpl implements empservice {

    @Autowired
    private empdao Empdao;

    @Override
    public List<Map<String,Object>> getEmpall() {
        List<Map<String,Object>> list = Empdao.Listall();
        System.out.println("访问到了DAO");
        return list;
    }

}
