package lowLevelDesign.parkingLotSystemPracticing.PaymentManager;

import lowLevelDesign.parkingLotSystemPracticing.data.Ticket;
import lowLevelDesign.parkingLotSystemPracticing.enums.PaymentStatus;

public class CardPaymentManager implements PaymentManager{
    @Override
    public PaymentStatus pay(Double amount, Ticket ticket) {
        return PaymentStatus.SUCCESS;
    }
}
