package Commands;

import ConfigHandler.ConfigHandler;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Help extends ListenerAdapter {
    private final ConfigHandler ch;

    public Help(ConfigHandler ch) {
        this.ch = ch;
    }

    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setTitle("**Help Izbornik**");
        eb.setDescription("Trenutno nema komandi, samo psovke filter.");

        if (e.getMessage().getAuthor().isBot()) return;
        if (e.getMessage().getContentRaw().equalsIgnoreCase(ch.getPrefix() + "help")) {
            e.getChannel().sendMessage(eb.build()).queue();
        }
    }

}
