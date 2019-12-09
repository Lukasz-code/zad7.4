package com.kodilla.steam.beautifier;

public class PoemBeautifier {
    public void beautify (String toBeautify, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(toBeautify);
        System.out.println(result);

    }
}
