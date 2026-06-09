package com.example.teamapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.teamapp.service.ItouService;
import com.example.teamapp.service.YamamotoService;

@Controller
public class TeamController {
	@Autowired private YamamotoService yamamotoService; // メンバーのServiceを注入
	@Autowired private ItouService itouService;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("leaderMsg", "リーダーです！");
        model.addAttribute("yamamotoMsg", yamamotoService.getProfile()); // 画面に渡す
        model.addAttribute("itouMsg", itouService.getProfile()); // 画面に渡す
        // TODO: ここにメンバーのServiceを後で呼ぶ
        return "index";
    }
}
