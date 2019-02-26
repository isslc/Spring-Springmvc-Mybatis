package com.csl.controller;

import com.csl.entity.User;
import com.csl.service.UserDaoService;
import com.csl.util.ResponseUtil;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author a
 */
@Controller
public class contrellor {
    @Resource
    UserDaoService userDaoService;
    @RequestMapping("/hello")
    public JSONObject hello(HttpServletResponse response, HttpSession session/*,
                            @RequestParam(value = "id", required = false) Integer id*/) {
        System.out.println("进来");
        User user = userDaoService.select();
        System.out.println(user);
        JSONObject result = new JSONObject();
        result.put("data", user);
        result.put("success", true);
        try {
            ResponseUtil.write(response, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/info")
    public void info(HttpServletResponse response, HttpSession session,
                     @RequestParam(value = "name", required = false) String name) throws IOException {
        String use1r = userDaoService.info(name);
        String result = null;
        if (use1r==null) {
            result = "<font color='grenn'>该用户名可以使用</font>";
        } else {
            result = "<font color='red'>该用户名已存在</font>";
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(result);
    }


}
