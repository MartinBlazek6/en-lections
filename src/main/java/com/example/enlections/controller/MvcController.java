package com.example.enlections.controller;

import com.example.enlections.service.LectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MvcController {
    private final LectionService lectionService;

    @GetMapping("/")
    public String allLections(Model model){
        model.addAttribute("lections",lectionService.allLection());
        return "index";
    }

}
