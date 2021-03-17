package com.newjob.testtask.controller;

import com.newjob.testtask.db.entity.ReverseVowels;
import com.newjob.testtask.service.ReverseVowelsServiceImpl;
import com.newjob.testtask.service.VowelsRvrs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class ReverseVowelesController {

    private final ReverseVowelsServiceImpl reverseVowelsService;
    private final VowelsRvrs vowelsRvrs;

    @Autowired
    public ReverseVowelesController(ReverseVowelsServiceImpl reverseVowelsService, VowelsRvrs vowelsRvrs) {
        this.reverseVowelsService = reverseVowelsService;
        this.vowelsRvrs = vowelsRvrs;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/form";
    }

    @GetMapping("/form")
    public String formGet() {
        return "form";
    }

    @PostMapping("/form")
    public String formPost(InputDto input, Model model) {
        if (input.getInputStr().isEmpty()) {
            return "form";
        }
        String lastVaue = input.getInputStr();
        String reverseStr = vowelsRvrs.replaceVolve((lastVaue),vowelsRvrs.createValueQueue(lastVaue));
        reverseVowelsService.addReverseVowels(new ReverseVowels(input.getInputStr()));
        model.addAttribute("was", lastVaue);
        model.addAttribute("reverse", reverseStr);

        return "form";
    }


}
