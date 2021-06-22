package fr.tyrolium.maxime.bot;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class main {
    public static void main(String[] argv) throws LoginException, IOException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken(stock.tokenServ);
        builder.addEventListeners(new test());
        builder.setActivity(Activity.playing("TyroServ.fr | ONLINE"));
        builder.build();
        System.out.println("Le bot c'est bien lanceer");


        String onlineServ = get("http://tyrolium.fr/Contenu/Php/api/status.php");
        System.out.println(onlineServ);
        while (onlineServ != ""){
            onlineServ = get("http://tyrolium.fr/Contenu/Php/api/status.php");
            if (onlineServ == ""){
                System.out.println("pas de co");
                builder.setActivity(Activity.watching("TyroServ.fr | OFFLINE"));
                builder.build();
            }else {
                System.out.println("bien co");
            }
        }
        while (onlineServ == ""){
            onlineServ = get("http://tyrolium.fr/Contenu/Php/api/status.php");
            if (onlineServ == ""){
                System.out.println("pas de co");
            }else {
                System.out.println("bien co");
            }
        }
    }
    public static String get(String url) throws IOException{

        String source ="";
        URL oracle = new URL(url);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null)
            source +=inputLine;
        in.close();
        return source;
    }
}
