package com.kodilla.good.patterns.productOrderSerwis;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Wysyłanie maila do " + user.getName() + " " + user.getLastName());
    }
}
