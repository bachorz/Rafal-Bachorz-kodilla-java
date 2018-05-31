package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain {

    public static void main(String[] args) {

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("Abc ", "This is module number seven ", ((deco, text) -> deco + text + deco));
//        poemBeautifier.beautify("Abc ", "This is module number seven ", ((deco, text) -> deco.toUpperCase() + text.toUpperCase() + deco.toUpperCase()));
//        poemBeautifier.beautify("Abc ", "This is module number seven ", ((deco, text) -> deco.trim().toUpperCase() + text.trim().toLowerCase() + deco.toUpperCase()));
//        poemBeautifier.beautify("Abc ", "This is module number seven ", ((deco, text) -> deco.toLowerCase()+ text.toLowerCase()));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
