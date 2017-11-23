package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Format text", (String text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("First Text to format", (String text) -> text.toUpperCase());
        poemBeautifier.beautify("NeXT TEXT TO FORMAT", (String text) -> text.toLowerCase());
        poemBeautifier.beautify("third text to format", (String text) -> Character.toUpperCase(text.charAt(0)) + text.substring(1));

    }
}
