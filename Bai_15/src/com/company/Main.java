package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(name);

        String text = sc.nextLine();
        // String test = text.replaceAll("^ +| +$|( )+", "$1");
        StringTokenizer tokenizer = new StringTokenizer(text, " ", false) ;
        String[] tokens = new String[tokenizer.countTokens()] ;

        text = text.toLowerCase() ;
        for (int i = 0; i < tokens.length; i ++){
            tokens[i] = tokenizer.nextToken();
        }

        StringBuilder normalize = new StringBuilder();
        boolean dot = false ;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].charAt(0) == '.') {
                dot = true;
            }
            else {
                String concade = "" ;
                if (i != 0)
                    concade = " ";
                concade += tokens[i].substring(0, 1).toUpperCase() + tokens[i].substring(1) ;
                if (dot) {
                    tokens[i] = concade;
                    dot = false;
                }
                else {
                    tokens[i] = concade;
                }
            }

            normalize.append(tokens[i]) ;
        }

        String res = normalize.toString();
        System.out.println(res);
    }
}
