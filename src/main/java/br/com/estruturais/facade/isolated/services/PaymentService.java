package br.com.estruturais.facade.isolated.services;

import java.util.List;
import br.com.estruturais.facade.isolated.model.Card;
import br.com.estruturais.facade.isolated.model.Register;

public class PaymentService {
    private RegisterService registerService;

    public PaymentService(RegisterService registerService) {
        this.registerService = registerService;
    }

    public void getPaymentInfoByCard(Card card) {
        List<Register> registers = registerService.getRegistersByCard(card);
        double sum = registers.stream()
            .reduce(0d, (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
        System.out.println(String.format("You have to pay %.2f until next week", sum));
    }

}