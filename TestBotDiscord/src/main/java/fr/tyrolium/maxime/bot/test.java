package fr.tyrolium.maxime.bot;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class test extends ListenerAdapter {
    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        User userTab = event.getAuthor();
        MessageChannel channelTab = event.getChannel();
        Guild guildTab = event.getGuild();
        System.out.println(guildTab.getName() + " / " + channelTab.getName() + " / " + userTab.getAsTag() + " ----> " + event.getMessage().getContentRaw());


        if (event.getMessage().getContentRaw().toLowerCase().contains("on peut sortir ?")) {
            event.getChannel().sendMessage("Non. #RestezChezVous").queue();
            System.out.println(guildTab.getName() + " / " + channelTab.getName() + " <Requette Effectuez>");
        }

        if (event.getMessage().getContentRaw().toLowerCase().contains(main.Prefix + "help")) {
            event.getChannel().sendMessage("hum ya pas grand chose dans le bot pour l'instant").queue();
            System.out.println(guildTab.getName() + " / " + channelTab.getName() + " <Requette Effectuez>");
        }

        if (event.getMessage().getContentRaw().toLowerCase().contains("je suis qui ?")) {
            event.getChannel().sendMessage("vous etes" + userTab.getName()).queue();
            System.out.println(guildTab.getName() + " / " + channelTab.getName() + " <Requette Effectuez>");
        }

        if (event.getMessage().getContentRaw().toLowerCase().contains("ya combien de membre sur le serveur ?")) {
            event.getChannel().sendMessage("btn").queue();
            System.out.println(guildTab.getName() + " / " + channelTab.getName() + " <Requette Effectuez>");
        }


        if (event.getMessage().getContentRaw().toLowerCase().contains(main.Prefix + "debug")) {
            Number userId = userTab.getIdLong();
          /*if (userTab == Papa){
                event.getChannel().sendMessage("Coucou maxime").queue();
            }*/
            event.getChannel().sendMessage("__Debug__" + userTab + " " + userId).queue();
        }
    }
}
