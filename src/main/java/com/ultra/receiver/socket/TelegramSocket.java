package com.ultra.receiver.socket;

import com.ultra.base.enums.API;
import com.ultra.receiver.Gateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public class TelegramSocket extends TelegramLongPollingBot {
    private static final Logger logger = LoggerFactory.getLogger(TelegramSocket.class);

    @Autowired
    private Gateway gateway;

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            try {
                // Call method to send the message
                SendMessage message = (SendMessage) gateway.proceed(API.TELEGRAM, update);
                message.setChatId(update.getMessage().getChatId());
                sendMessage(message);
            } catch (TelegramApiException e) {
                logger.error("TelegramApiException - {}", e);
            }
        }

    }

    @Override
    public String getBotUsername() {
        return "UltraDemoBot";
    }

    @Override
    public String getBotToken() {
        return "303523137:AAG4OXaFUdB91Jde5u__e4WRC2LfDyre7n4";
    }
}
