package com.kodilla.good.patterns.producentService;

import java.util.ArrayList;
import java.util.List;

public class ContractorList implements ContractorsInformationService{

    private List<Contractor> list = retrieveContractorsList();

    public ContractorList() {
        this.list = retrieveContractorsList();
    }

    public ContractorList(Contractor contractor) {
        addNewContractor(contractor);
    }

    private List<Contractor> retrieveContractorsList() {
        List<Contractor> list = new ArrayList<>();
        list.add(new Contractor("ExtraFoodShop", new Product("Milk", 100)));
        list.add(new Contractor("SlowFood", new Product("Cheese", 250)));
        list.add(new Contractor("Health", new Product("Bread", 346)));
        list.add(new Contractor("Vital", new Product("Carrot", 345)));
        list.add(new Contractor("ExtraFoosShop", new Product("Natural Yogurt", 547 )));
        return list;
    }



    public void addNewContractor(Contractor contractor) {
        this.list.add(contractor);
    }

    public List<Contractor> getList() {
        return list;
    }

    @Override
    public List<Contractor> contractorsList() {
        return this.list;
    }
}
