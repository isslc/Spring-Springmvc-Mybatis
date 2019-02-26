package com.csl.controller.admin;

import com.csl.entity.User;
import com.csl.service.UserDaoService;
import com.csl.util.ResponseUtil;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Resource
    UserDaoService userDaoService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user, HttpServletRequest request, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("utf-8");
        JSONObject result=new JSONObject();
        User resultUser=userDaoService.login(user);
        if (resultUser!=null){
            HttpSession session=request.getSession();
            session.setAttribute("currentUser", resultUser);
            result.put("success",false);
            ResponseUtil.write(response, result);
            return "redirect:/admin/admin.html";
        }else {
            result.put("data","用户名或密码错误");
            result.put("success",true);
            ResponseUtil.write(response, result);
            return  null;
        }



    }
}
