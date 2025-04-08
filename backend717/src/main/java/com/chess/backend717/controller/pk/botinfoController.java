package com.chess.backend717.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/pk/")
public class botinfoController {
    @RequestMapping("getbotinfo/")
    public List<String> getbotinfo(){
        List<String> List = new LinkedList<>();
        List.add("joker");
        List.add("pig");

        return List;
    }
}
