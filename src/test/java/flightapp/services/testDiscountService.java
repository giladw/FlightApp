package flightapp.services;

import flightapp.repositories.CouponRepository;
import flightapp.services.DiscountService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class testDiscountService{
    //te
    @Test
    public void DiscountService_testForDebugging() {
        //Arrange
        ArrayList<Integer> couponList = new ArrayList<>();
        couponList.add(1);
        DiscountService a = new DiscountService(new CouponRepository(couponList));
        //Act
        double result = a.getDiscount(1, 100);

        //Assert
        //TODO extract random output for assertion
    }
}
