package com.ultra;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
	@Override
	public void onUpdateReceived(Update update) {
		if (update.hasMessage() && update.getMessage().hasText()) {
			SendMessage message = new SendMessage() // Create a SendMessage
													// object with mandatory
													// fields
					.setChatId(update.getMessage().getChatId()).setText(update.getMessage().getText());
			try {
				sendMessage(message); // Call method to send the message
			} catch (TelegramApiException e) {
				e.printStackTrace();
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
