package group_tg;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        if(update.hasMessage()&& update.getMessage().hasText()){
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

//            foydalanuvchidan ma'lumot olish

            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();

            System.out.println("Firstname:" + firstName + "\nLastname:"+
                    lastName + "\nText:" + text + "\nchatId:" + chatId);

        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            Long chatId = callbackQuery.getMessage().getChatId();
            Integer messageId = update.getMessage().getMessageId();
        }

    }

    @Override
    public String getBotUsername() {
        return "jamoauserBot";
    }

    @Override
    public String getBotToken() {
        return "8291508337:AAEGVzClKodXEAk0GIY1jne--iivlXZbEfs";
    }
}
