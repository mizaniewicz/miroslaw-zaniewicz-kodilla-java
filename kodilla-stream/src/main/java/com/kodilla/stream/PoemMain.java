package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class PoemMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("litwo ojczyzno moja ty jesteś jak zdrowie", poem -> poem.toUpperCase()));
        System.out.println(poemBeautifier.beautify("litwo ojczyzno moja ty jesteś jak zdrowie", poem -> poem.toLowerCase()));
        System.out.println(poemBeautifier.beautify("litwo ojczyzno moja ty jesteś jak zdrowie", poem -> "***" + poem + "***"));
        System.out.println(poemBeautifier.beautify("litwo ojczyzno moja ty jesteś jak zdrowie", poem -> poem.replace("o", "0").replace("e", "3")));
    }
}
.