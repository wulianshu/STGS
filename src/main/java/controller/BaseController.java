package controller;

import model.BaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.BaseService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

//
@Controller
public class BaseController {
    @Resource(name = "baseService")
    BaseService baseService;
    @RequestMapping(value="/base")
    public Model basePage(HttpServletResponse response,HttpServletRequest request,
                         @RequestParam(value = "loginName")String loginName,
                         @RequestParam(value = "loginPassword")String loginPassword,
                         Model model){
        System.out.println("访问测试"+loginName+"|"+loginPassword);
        BaseModel baseModel=new BaseModel();
        baseModel.setLoginName(loginName);
        baseModel.setLoginPassword(loginPassword);;
        model.addAttribute("loginUser",baseService.queryTest(baseModel));
        //要将uimodel return回去再前台才能得到你所添加的参数
        return model;
    }

    @RequestMapping(value="/login")
    public Model login(HttpServletResponse response,HttpServletRequest request,Model model,Map params){
        System.out.println("注入测试");
        String loginName="testName";
        String loginPassword="testPassword";
        Map paramsMap=new HashMap();
        paramsMap.put("loginName",loginName);
        paramsMap.put("loginPassword", loginPassword);
        model.addAllAttributes(paramsMap);
        return model;
    }
}
