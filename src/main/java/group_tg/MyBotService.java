package group_tg;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class MyBotService {

//    start bosilganda chiqadigan button va text

    public SendMessage start(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Assalomu aleykum botimizga xush kelibsiz");
        return sendMessage;
    }
}
