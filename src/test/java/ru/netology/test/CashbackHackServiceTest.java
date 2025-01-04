package ru.netology.test ;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculate() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1_900);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldNotCalculate() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(2_000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
