package tech.reliab.java.froloviv.realization;

import tech.reliab.java.froloviv.entity.Phone;

public class CreateOrder {
    public String createOrder(Phone phone) {
        return "\n\nВаш заказ на покупку телефона с представленными" +
                "ниже характеристикамиуспешно создан!\n" + phone;
    }
}
