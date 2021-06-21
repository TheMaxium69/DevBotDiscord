package fr.tyrolium.maxime.bot;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class main {
    public static void main(String[] argv) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken(stock.token);
        builder.addEventListeners(new test());
        builder.setActivity(Activity.watching("JE SUIS EN DEV WHOUUUAAA"));
        builder.build();

        System.out.println("Le bot c'est bien lancé");
    }

    public static String Prefix = "test!";
   // public static Integer PapaId = 363366883652796416;
}
