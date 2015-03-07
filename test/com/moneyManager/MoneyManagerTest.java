package com.moneyManager;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by cprasenj on 3/6/2015.
 */
public class MoneyManagerTest {
    private MoneyManager mgr;
    @Before
    public void setup() {
        System.out.printf("Pooja");
        this.mgr = new MoneyManager(1000);
    }

    @Test
    public void dummyTest(){
        assertTrue(true);
    }
    @Test
    public void MoneyManager_holds_Cash_in_hand_at_any_point_of_day_for_each_day(){
        assertEquals(mgr.getCashInHand(), 1000,0.0);
    }
    @Test
    public void MoneyManager_records_the_expenses_generated_by_the_user_and_calculates_cash_in_hand(){
        mgr.registerExpense("Shopping", 150);
        assertEquals(mgr.getCashInHand(),850,0.0);
    }
    @Test
    public void MoneyManager_should_not_allow_to_register_negative_expense() {
//        mgr.registerExpense("Shopping", -100);
        
    }

}
