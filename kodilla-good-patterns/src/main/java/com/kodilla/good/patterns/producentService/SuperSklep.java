package com.kodilla.good.patterns.producentService;

public class SuperSklep implements AlternativeContractor {

    @Override
    public Contractor createNewContractor() {
        Product product = new Product("Milk", 456);
        return new Contractor(this.getClass().getSimpleName(), product);
    }


}
