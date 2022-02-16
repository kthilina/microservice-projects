package com.kasunth.rentacloud.configconsumer.controller;

import com.kasunth.rentacloud.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProfileController {

    @Autowired
    private MemberProfileConfiguration memberProfileConfiguration;

    @ResponseBody
    @GetMapping("/profile")
    public MemberProfileConfiguration getConfig() {
        return memberProfileConfiguration;
    }

    @GetMapping("/")
    public String getConfig(Model model) {
        model.addAttribute("model", memberProfileConfiguration.getDefaultModel());
        model.addAttribute("min", memberProfileConfiguration.getRentPeriod());
        return "mprofile.html";
    }
}
