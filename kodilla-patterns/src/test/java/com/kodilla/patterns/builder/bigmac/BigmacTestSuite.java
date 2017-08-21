package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBuildNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(Roll.sesame)
                .burgers(2)
                .sauce(Sauce.islands1k)
                .ingredient(Ingredients.cheese)
                .ingredient(Ingredients.bacon)
                .ingredient(Ingredients.mushrooms)
                .build();
        System.out.println(bigmac);
        //When
        //Then
        Assert.assertEquals(3, bigmac.getIngredients().size());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals(Sauce.islands1k, bigmac.getSauce());
        Assert.assertTrue(bigmac.getIngredients().contains(Ingredients.cheese));
        Assert.assertTrue(bigmac.getIngredients().contains(Ingredients.bacon));
        Assert.assertTrue(bigmac.getIngredients().contains(Ingredients.mushrooms));
        Assert.assertFalse(bigmac.getIngredients().contains(Ingredients.cucumber));
    }
}
