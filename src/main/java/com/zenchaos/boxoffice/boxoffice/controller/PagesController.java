package com.zenchaos.boxoffice.boxoffice.controller;

@Controller
public class PagesController {
    @RequestMapping("/home")
    public String home() {
        return "index";
    }
}
