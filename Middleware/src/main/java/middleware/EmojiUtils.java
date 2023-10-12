package middleware;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmojiUtils {
    
    public EmojiUtils(){}
    public static String transformToEmoji(String text) {
        text = text.replace(":-)", "&#128522;");  // Transforma :-) em código de escape Unicode para o emoji de cara feliz
        text = text.replace(":-(", "&#128542;");  // Transforma :-( em código de escape Unicode para o emoji de cara triste
        text = text.replace(":-/", "&#128533;");  // Transforma :-/ em código de escape Unicode para o emoji de cara em dúvida
        return text;
    }
}
