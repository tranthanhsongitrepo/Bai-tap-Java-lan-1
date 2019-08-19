package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static String normalize(String text){
        text = text.toLowerCase() ;

        // String test = text.replaceAll("^ +| +$|( )+", "$1");
        StringTokenizer tokenizer = new StringTokenizer(text, " ", false) ;
        String[] tokens = new String[tokenizer.countTokens()] ;

        for (int i = 0; i < tokens.length; i ++){
            tokens[i] = tokenizer.nextToken();
        }

        StringBuilder normalize = new StringBuilder();
        boolean dot = true ;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].charAt(0) == '.') {
                dot = true;
            }
            else {
                String concade = "" ;
                if (i != 0)
                    concade = " ";
                if (dot) {
                    concade += tokens[i].substring(0, 1).toUpperCase() + tokens[i].substring(1) ;
                    tokens[i] = concade;
                    dot = false;
                }
                else {
                    concade += tokens[i];
                    tokens[i] = concade;
                }
            }

            normalize.append(tokens[i]) ;
        }

        return normalize.toString();
    }
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(name);

        String text = sc.nextLine();
        System.out.println(normalize(text));
    }
}
