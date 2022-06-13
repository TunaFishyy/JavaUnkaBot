package Events;

import ConfigHandler.ConfigHandler;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;

public class MessageEvent extends ListenerAdapter {

    private ArrayList<String> spam = new ArrayList<>();
    private final ConfigHandler ch;

    public MessageEvent(ConfigHandler ch) {
        this.ch = ch;
    }

    public void onGuildMessageReceived(MessageReceivedEvent e) {
        String message = e.getMessage().getContentRaw();
        checkSpam(message, e);

    }

    public void checkSpam(String message, MessageReceivedEvent event) {
        spam.add("fuck");spam.add("dick");spam.add("shit");spam.add("kurac");spam.add("kurcina");spam.add("kurćina");spam.add("kurčina");
        spam.add("jebati");spam.add("jebem");spam.add("jeben");spam.add("jeba");spam.add("jebo");spam.add("pas mater");spam.add("picka");
        spam.add("picketina");spam.add("picko");spam.add("pizda");spam.add("pidzo");spam.add("pizde");spam.add("pizdu");spam.add("picku");
        spam.add("picke");spam.add("pička");spam.add("pičku");spam.add("pičke");

        for (int i = 0; i < spam.size(); i++) {
            if (message.toLowerCase().contains(spam.get(i))) {
                event.getMessage().delete().queue();
                event.getChannel().sendMessage(event.getMember().getUser().getAsMention() + " nema psovanja!").queue();
                break;
            }
        }
    }


}
