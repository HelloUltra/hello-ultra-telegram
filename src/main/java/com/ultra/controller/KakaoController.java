//package com.ultra.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ultra.messenger.Kakao;
//
//@RestController
//@RequestMapping("/bot/kakao")
//public class KakaoController {
//
//    private static final Logger log = LoggerFactory.getLogger(KakaoController.class);
//
//    private static final Kakao messenger = new Kakao();
//
//    @PostMapping("")
//    public Object getMessage() {
//        // TODO Auto-generated method stub
//        Object obj = messenger.sendMessage();
//
//        return obj;
//    }
//}