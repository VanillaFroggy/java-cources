package tech.reliab.java.froloviv.service;

import tech.reliab.java.froloviv.entity.Phone;

public interface OrderProcessing {
    String createOrder(Phone phone);

    String changeOrder(Phone phone);

    String returnOrder(Phone phone);
}
