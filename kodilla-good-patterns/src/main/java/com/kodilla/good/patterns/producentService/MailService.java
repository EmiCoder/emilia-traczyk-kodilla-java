package com.kodilla.good.patterns.producentService;

public class MailService implements OrderInformationService{

    @Override
    public void inform(User user) {
        System.out.println("e-mail sending");
    }
}
