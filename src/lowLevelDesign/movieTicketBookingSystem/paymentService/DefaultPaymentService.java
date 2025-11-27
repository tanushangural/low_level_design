package lowLevelDesign.movieTicketBookingSystem.paymentService;

import lowLevelDesign.movieTicketBookingSystem.User;
import lowLevelDesign.movieTicketBookingSystem.enums.PaymentStatus;

public class DefaultPaymentService implements PaymentService{
    @Override
    public PaymentStatus pay(Double amount, User user) {
        return PaymentStatus.SUCCESS;
    }
}
