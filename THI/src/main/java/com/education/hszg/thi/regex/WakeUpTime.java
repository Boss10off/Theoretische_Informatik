package com.education.hszg.thi.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WakeUpTime {

    public static void main(String[] args) {
        //"Mon:7.30h" ja
        //"Montag:7.30h" nein
        //"Mon:19.67h" nein

        System.out.println("Testen,ob meine Aufstehzeit richtig eingetragen ist.");
        Pattern testpattern = Pattern.compile("[a-z]{3}:[0-2][09].[0-5][0-9]h",Pattern.CASE_INSENSITIVE);
        Matcher matcher = testpattern.matcher("Mon:07.30h");
        System.out.println("Test1: Mon:7.30h Ja"+matcher.find());

        Pattern testpattern2 = Pattern.compile("a*ba+na+ba*",Pattern.CASE_INSENSITIVE);
        Matcher matcherpattern2 = testpattern2.matcher("aaababaaaba");
        System.out.println("aaababaaaba"+matcherpattern2.find());

        Pattern testpattern3 = Pattern.compile("[A-Za-z]+[1-9][0-9]{6}202[2-5]",Pattern.CASE_INSENSITIVE);
        Matcher matcherpattern3 = testpattern3.matcher("Alexander,8394382,2024");
        System.out.println("Alexander,8394382,2024"+matcherpattern3.find());
    }
}
