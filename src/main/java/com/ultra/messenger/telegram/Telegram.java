package com.ultra.messenger.telegram;

import com.ultra.base.enums.API;
import com.ultra.messenger.BaseMessenger;
import com.ultra.base.request.Request;
import com.ultra.base.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class Telegram extends BaseMessenger<Update, SendMessage> {

    private static final Logger logger = LoggerFactory.getLogger(Telegram.class);

    public Telegram() {
        super(API.TELEGRAM);
    }

    @Override
    public Request receive(Update request) {
        logger.info("receive request.getMessage() : {}", request.getMessage());
        return null;
    }

    @Override
    public SendMessage transmit(Response response) {
        logger.info("transmit response.getMessage() : {}", response.getMessage());

        SendMessage message = new SendMessage().setText(response.getMessage());
        return message;
    }
}
