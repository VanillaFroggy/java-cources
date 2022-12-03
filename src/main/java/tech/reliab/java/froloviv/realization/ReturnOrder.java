package tech.reliab.java.froloviv.realization;

import tech.reliab.java.froloviv.entity.Phone;

public class ReturnOrder {
    public String returnOrder(Phone phone) {
        return "\n\nВозврат вашего телефона с представленными ниже характеристиками выполнен успешно!\n" + phone;
    }
}
