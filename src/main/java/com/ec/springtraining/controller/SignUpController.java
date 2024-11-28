package com.ec.springtraining.controller;

import com.ec.springtraining.service.UserApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class SignUpController {

    @Autowired
    private UserApplicationService userApplicationService;;

    @GetMapping("/signup")
    public String getSignUp(Model model) {
        //性別を取得
        Map<String, Integer> genderMap = userApplicationService.getGenderMap();
        model.addAttribute("genderMap", genderMap);

        // ユーザ登録画面に遷移
        return "user/signup";
    }

    /**ユーザー登録処理**/
    @PostMapping
    public String postSignUp() {
        //ログイン画面にリダイレクト
        return "redirect:/login";
    }
}
