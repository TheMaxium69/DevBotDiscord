package fr.tyrolium.maxime.bot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class test extends ListenerAdapter {
    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().toLowerCase().contains("on peut sortir ?")) {
            event.getChannel().sendMessage("Non. #RestezChezVous").queue();
        }
    }
}
