package com.example.LookAtHwan.Controller;

import com.example.LookAtHwan.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;


    


}
