package com.ultra.receiver.controller;

import com.ultra.base.enums.API;
import com.ultra.receiver.Gateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */

@RestController
public class MessageController {
    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);
    @Autowired
    private Gateway gateway;

    @PostMapping("{api}/message")
    public Object message(@PathVariable API api, @RequestParam Object data) {
        logger.info("MessageController API : {}" , api);
        return gateway.proceed(api, data);
    }
}
