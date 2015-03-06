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
    public void MoneyManager_holds_starting_money_for_each_day(){
        MoneyManager mgr = new MoneyManager(10000);
        assertEquals(mgr.getStartingCash(), 10000);
    }
}
