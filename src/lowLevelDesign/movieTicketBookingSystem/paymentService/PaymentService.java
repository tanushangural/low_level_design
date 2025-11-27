package lowLevelDesign.movieTicketBookingSystem.paymentService;

import lowLevelDesign.movieTicketBookingSystem.User;
import lowLevelDesign.movieTicketBookingSystem.enums.PaymentStatus;

public interface PaymentService {
    PaymentStatus pay(Double amount, User user);
}
