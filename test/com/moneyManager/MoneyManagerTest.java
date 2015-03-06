package com.moneyManager;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by cprasenj on 3/6/2015.
 */
public class MoneyManagerTest {
    @Test
    public void dummyTest(){
        assertTrue(true);
    }
    @Test
    public void MoneyManager_holds_Cash_in_hand_at_any_point_of_day_for_each_day(){
        MoneyManager mgr = new MoneyManager(10000);
        assertEquals(mgr.getCashInHand(), 10000,1.0);
    }
    @Test
    public void MoneyManager_records_the_expenses_generated_by_the_user_and_calculates_cash_in_hand(){
        MoneyManager mgr = new MoneyManager(1000);
        mgr.registerExpensen("Shopping",150);
        assertEquals(mgr.getCashInHand(),850,1.0);
    }

}
