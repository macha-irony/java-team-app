package com.example.teamapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("leaderMsg", "リーダーです！");
        // TODO: ここにメンバーのServiceを後で呼ぶ
        return "index";
    }
}
