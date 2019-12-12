package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigmac() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                        .bun("sezam")
                        .burgers(2)
                        .sauce("barbecue")
                        .ingredient("onion")
                        .ingredient("cheese")
                        .ingredient("cucumber")
                        .build();
        int amountOfIngredients = bigmac.getIngredients().size();
        int amountOfBurgers = bigmac.getBurgers();
        Assert.assertEquals(3, amountOfIngredients);
        Assert.assertEquals(2, amountOfBurgers);
    }
}
