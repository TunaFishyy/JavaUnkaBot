package io.github.TunaFishyy.Commands;

import io.github.TunaFishyy.ConfigHandler.ConfigHandler;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Help extends ListenerAdapter {
    public final ConfigHandler ch;

    public Help(ConfigHandler ch) {
        this.ch = ch;
    }

    public void onMessageReceived(MessageReceivedEvent e) {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setTitle("**Help Izbornik**");
        eb.setDescription("Trenutno nema komandi, samo psovke filter.");

        if (e.getMessage().getAuthor().isBot()) return;
        if (e.getMessage().getContentRaw().equalsIgnoreCase(ch.getPrefix() + "help")) {
            e.getMessage().replyEmbeds(eb.build()).queue();
        }
    }

}
