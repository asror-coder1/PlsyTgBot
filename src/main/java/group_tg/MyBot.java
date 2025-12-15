package group_tg;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    MyBotService myBotService = new MyBotService();
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

//            Reply button execute qilib chaqirish




        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();
            Integer messageId = update.getMessage().getMessageId();


//            if (data.equals("nimadurId")){
//                DeleteMessage deleteMessage = new DeleteMessage();
//                deleteMessage.setMessageId(messageId);
//                deleteMessage.setChatId(chatId);
//
//                try {
//                    execute(myBotService.start(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }

//
//            if (data.equals("nimadurId")){
//                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
//                editMessageReplyMarkup.setMessageId(messageId);
//                editMessageReplyMarkup.setChatId(chatId);
//                editMessageReplyMarkup.setReplyMarkup(myBotService.(chatId));
//
//                try {
//                    execute(editMessageReplyMarkup);
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }



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
