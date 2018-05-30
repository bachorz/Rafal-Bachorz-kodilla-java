package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String deco, String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(deco, text);
        System.out.println(result);
    }
}
