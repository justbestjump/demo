package jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MyTestInterceptor {
//    @RequestMapping("/test")
    @ResponseBody
    public void test(HttpServletResponse response) throws IOException {
        System.out.println("prehandle已通过，执行拦截目标中。。。");
        response.getWriter().write("即将执行afterCompletion。。。。");
    }
}
