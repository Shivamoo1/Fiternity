/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitternity.divyanshu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mycontroller {
    
    @GetMapping("/")
    String go()
    {
        return "index.html";
    }
    
    @GetMapping("/signin")
    String go2()
    {
        return "signin.html";
    }
}
