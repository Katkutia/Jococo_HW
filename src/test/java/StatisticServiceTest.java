
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import ru.netology.statistic.StatisyicService;

public class StatisticServiceTest {

    @Test
    void findMaxAtBegin() {
        StatisyicService service = new StatisyicService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMaInTheMiddle() {
        StatisyicService service = new StatisyicService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 88, 6, 11, 11, 12};
        long expected = 88;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}