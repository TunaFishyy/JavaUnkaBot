package io.github.TunaFishyy;

import io.github.TunaFishyy.Commands.Help;
import io.github.TunaFishyy.ConfigHandler.ConfigHandler;
import io.github.TunaFishyy.Events.MessageEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
    public final ConfigHandler ch;

    public Bot(ConfigHandler ch) {
        this.ch = ch;
    }

    @Deprecated
    public static void main(String[] args) throws Exception {
        Bot bot = new Bot(new ConfigHandler());

        JDA jda = JDABuilder.createDefault(bot.ch.getToken()).build();
        jda.addEventListener(new Help(bot.ch));
        jda.addEventListener(new MessageEvent(bot.ch));

    }
}