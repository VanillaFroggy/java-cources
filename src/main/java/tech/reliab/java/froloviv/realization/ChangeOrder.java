package tech.reliab.java.froloviv.realization;

import tech.reliab.java.froloviv.entity.Phone;
import tech.reliab.java.froloviv.entity.PhoneType;

public class ChangeOrder {
    public String changeOrder(Phone phone) {
        phone.setBatteryCapacity(4000);
        phone.setHousingMaterial("Металл");
        phone.setMemorySize("2Гб");
        phone.setScreenDiagonal(6.81);
        phone.setPhoneType(PhoneType.SAMSUNG);
        return "\n\nВаш заказ был успешно изменён, в вашем заказе теперь устройство с нижепреведнными" +
                "характеристиками\n" + phone;
    }
}
