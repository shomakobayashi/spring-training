package com.ec.springtraining.hello;

import ch.qos.logback.classic.spi.ConfiguratorRank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @PostMapping("/hello")
    public String postRequest(@RequestParam("text1") String str, Model model) {
        //画面から受け取った文字列をModelに登録
        model.addAttribute("sample", str);
        return "hello/response";
    }

    @PostMapping("/hello/db")
    public String postDbRequest(@RequestParam("text2") String id, Model model) {

        //1件検索
        Employee employee = helloService.getEmployee(id);

        //検索結果をModelに登録
        model.addAttribute("employee", employee);

        //db.htmlに画面遷移
        return "hello/db";
    }
}
