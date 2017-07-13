package svr.tony.controller;

import svr.tony.model.emp;
import svr.tony.service.empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2017/4/4.
 */
@Controller
@RequestMapping("")
public class empcontroller {

    @Autowired
    private empservice EmpService;

    @RequestMapping("/listuser")
    //@RequestBody
    public ModelAndView Listall(@RequestParam Map<String, Object> param) throws UnsupportedEncodingException{

        System.out.println("第一步:控制层");
        List<Map<String,Object>> Alluser = EmpService.getEmpall();

        ModelAndView mv = new ModelAndView("user");

        if (param.get("userName")!="") {
            //mv.setViewName("user");
            mv.addObject("Alluser",param.get("userName"));
            System.out.println("第二步");
            mv.addObject("list",Alluser);
        }

        return mv;
    }
}
