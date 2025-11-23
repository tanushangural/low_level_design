package lowLevelDesign.parkingLotSystemPracticing.PaymentManager;

import lowLevelDesign.parkingLotSystemPracticing.data.Ticket;
import lowLevelDesign.parkingLotSystemPracticing.enums.PaymentStatus;

public interface PaymentManager {
    PaymentStatus pay(Double amount, Ticket ticket);
}
