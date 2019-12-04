package com.kodilla.good.patterns.producentService;

public class GlutenFreeShop implements NewContractor {

    @Override
    public Contractor createNewContractor() {
        Product product = new Product("GlutenFreeBread", 456);
        System.out.println(this.getClass().getSimpleName() + " information: " + "\n" +
                            "Product name: " + product.getName() + "\n" +
                            "Product amount: " + product.getAmount());
        return new Contractor(this.getClass().getSimpleName(), product);
    }
}
