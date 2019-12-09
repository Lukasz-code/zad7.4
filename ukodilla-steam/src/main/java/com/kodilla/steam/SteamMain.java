package com.kodilla.steam;

import com.kodilla.steam.beautifier.PoemBeautifier;

import javax.swing.text.StyledEditorKit;

public class SteamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(" Przykładowy tekst ", (toBeautify) -> "AVA" + toBeautify + "AVA" );
        poemBeautifier.beautify(" Przykładowy tekst ", (toBeautify) -> toBeautify.toUpperCase());
        poemBeautifier.beautify(" Przykladowy Tekst ", (toBeautify) -> toBeautify.toLowerCase());
        poemBeautifier.beautify(" Przykladowy tekst ", (toBeautify) -> (char)27 + toBeautify + (char)27) ;
    }
}
