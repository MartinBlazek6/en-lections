package com.example.enlections.controller;

import com.example.enlections.service.LectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MvcController {
    private final LectionService lectionService;

    @GetMapping("/")
    public String allLections(Model model){
        model.addAttribute("lections",lectionService.allLection());
        return "index";
    }
    @PostMapping("/createLection")
    public String createLection(@RequestParam String title, String level){
    lectionService.createClass(title,level);
        return "redirect:/";
    }
    @PostMapping("addStudentToLection")
    public String addStudentToLection(@RequestParam String studentEmail, Long lectionId){
    lectionService.addUserToLection(lectionId,studentEmail);
        return "redirect:/";
    }


}
