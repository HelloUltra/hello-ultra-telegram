package com.ultra.base;

import com.ultra.base.enums.API;
import com.ultra.messenger.BaseMessenger;
import com.ultra.messenger.Messenger;
import com.ultra.messenger.kakao.Kakao;
import com.ultra.messenger.line.Line;
import com.ultra.messenger.slack.Slack;
import com.ultra.messenger.telegram.Telegram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class MessengerFactory {
    private static final Logger logger = LoggerFactory.getLogger(MessengerFactory.class);

    @Autowired
    private Set<BaseMessenger> messengers;

    private static Map<API, Messenger> messenger = new HashMap<>();

    @PostConstruct
    public void init(){
        logger.info("MessengerFactory init()");
        messengers.stream().forEach(ms -> messenger.put(ms.getApi(), ms));
    }

//    static {
//        logger.info("joonghyun");
//        messenger.put(API.TELEGRAM, new Telegram());
//        messenger.put(API.KAKAO, new Kakao());
//        messenger.put(API.LINE, new Line());
//        messenger.put(API.SLACK, new Slack());
//    }

    public BaseMessenger get(API api){
        return (BaseMessenger) messenger.get(api);
    }
}
