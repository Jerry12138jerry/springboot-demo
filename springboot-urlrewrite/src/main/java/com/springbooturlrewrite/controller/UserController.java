package com.springbooturlrewrite.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public String find(@PathVariable("id") Long id, @RequestParam("ken") String ken) {
        return "ok————" + id + "--" + ken;
    }
}
