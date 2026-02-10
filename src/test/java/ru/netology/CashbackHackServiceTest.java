package ru.netology;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
   @Test
  void MoreThen1000(){
       CashbackHackService service = new CashbackHackService();
       int amount = 1100;
       int expected = 900;
       int actual = service.remain(amount);
        assertEquals(expected, actual);

   }
    @Test
    void lessThen1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }
    @Test
    void EqualTo1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

}
