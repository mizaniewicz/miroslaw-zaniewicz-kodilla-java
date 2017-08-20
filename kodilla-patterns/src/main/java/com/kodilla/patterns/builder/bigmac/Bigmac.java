package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Rolls roll;
    private final int burgers;
    private final Sauces sauce;
    private final List<Ingredients> ingredients;

    private Bigmac(Rolls roll, int burgers, Sauces sauce, List<Ingredients> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {
        private Rolls roll;
        private int burgers;
        private Sauces sauce;
        private List<Ingredients> ingredients = new ArrayList<>();

        public BigmacBuilder roll(Rolls roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauces sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    public Rolls getRoll() {
        return roll;
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
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
