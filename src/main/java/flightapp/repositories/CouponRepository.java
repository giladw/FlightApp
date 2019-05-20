package flightapp.repositories;

import java.util.List;
import java.util.Random;

public class CouponRepository {
    private List<Integer> coupons;

    public CouponRepository(List<Integer> coupons) {
        this.coupons = coupons;
    }

    public boolean isValidCoupon(int couponId) {
        return coupons.contains(couponId);
    }
}

