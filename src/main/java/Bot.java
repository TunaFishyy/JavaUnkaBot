import Commands.Help;
import ConfigHandler.ConfigHandler;
import Events.MessageEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
    private ConfigHandler ch;

    public Bot(ConfigHandler ch) {
        this.ch = ch;
    }

    @Deprecated
    public static void main(String[] args) throws Exception {
        Bot bot = new Bot(new ConfigHandler());

        JDA jda = JDABuilder.createDefault(bot.ch.getToken()).build();
        jda.addEventListener(new Help(bot.ch), new MessageEvent(bot.ch));

    }
}