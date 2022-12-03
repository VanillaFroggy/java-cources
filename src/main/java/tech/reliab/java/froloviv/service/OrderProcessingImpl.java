package tech.reliab.java.froloviv.service;

import tech.reliab.java.froloviv.entity.Phone;
import tech.reliab.java.froloviv.realization.ChangeOrder;
import tech.reliab.java.froloviv.realization.CreateOrder;
import tech.reliab.java.froloviv.realization.ReturnOrder;

public class OrderProcessingImpl implements OrderProcessing{
    @Override
    public String createOrder(Phone phone) {
        CreateOrder createOrderImpl = new CreateOrder();
        return createOrderImpl.createOrder(phone);
    }

    @Override
    public String changeOrder(Phone phone) {
        ChangeOrder changeOrderImpl = new ChangeOrder();
        return changeOrderImpl.changeOrder(phone);
    }

    @Override
    public String returnOrder(Phone phone) {
        ReturnOrder returnOrderImpl = new ReturnOrder();
        return returnOrderImpl.returnOrder(phone);
    }
}
