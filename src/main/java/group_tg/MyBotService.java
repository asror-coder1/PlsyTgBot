package group_tg;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class MyBotService {

//    start bosilganda chiqadigan button va text

    public SendMessage start(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Assalomu aleykum botimizga xush kelibsiz");
        return sendMessage;
    }


//        Uzbek tilli bosilganda chiqadigan reply buttonlar

        public SendMessage replyBtn(Long chatId){
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Bun reply buttonlar tillar serviceni bosish orqali chiqdi");

            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();


            KeyboardRow row = new KeyboardRow();
            KeyboardButton button = new KeyboardButton();
            button.setText("Biz haqimizda");
            row.add(button);
            rowList.add(row);


            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setKeyboard(rowList);
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            return sendMessage;
        }


}
