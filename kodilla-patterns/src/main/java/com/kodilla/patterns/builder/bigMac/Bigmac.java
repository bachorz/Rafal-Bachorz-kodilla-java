package com.kodilla.patterns.builder.bigMac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final Bun bun;
    private final int burgers;
    private final Sauces sauce;
    private final List<Ingredients> ingredients;
    private final static int MIN_BURGERS = 1;
    private final static int MAX_BURGERS = 3;


    public static class BigmacBuilder {
        private Bun bum;
        private int burgers;
        private Sauces sauce;
        private List<Ingredients> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bum){
            this.bum = bum;
            return this;
        }

        public BigmacBuilder burgers(int burgers){
            if(burgers >= MIN_BURGERS && burgers <= MAX_BURGERS) {
                this.burgers = burgers;
            }else{
                throw new IllegalArgumentException("Incorrect number of burgers");
            }
            return this;
        }

        public BigmacBuilder sauce(Sauces sauce){
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(bum, burgers, sauce, ingredients);
        }
    }

    public Bigmac(Bun bun, int burgers, Sauces sauce, List<Ingredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauces getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" + "bun='" + bun + '\'' + ", burgers=" + burgers + ", sauce='" + sauce + '\'' + ", ingredients=" + ingredients + '}';
    }

}
