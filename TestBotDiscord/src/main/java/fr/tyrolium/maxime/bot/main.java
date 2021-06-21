package fr.tyrolium.maxime.bot;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class main {
    public static void main(String[] argv) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken(stock.token);
        builder.addEventListeners(new test());
        builder.build();

        System.out.println("coucou");
    }
}
