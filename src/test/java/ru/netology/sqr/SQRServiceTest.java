package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            //"testName,firstNumber,secondNumber,expRes"
            "200-300,200,300,3",
            "100-10000,100,10000,90",
            "300-500,300,500,5",
            "600-800,600,800,4",
            "1000-2000,1000,2000,13"
            //"failtest,100,1000,2" умышленно фэйловый тест
    })
    public void test(String testName, int firstNumber, int secondNumber, int expRes) {
        SQRService service = new SQRService();

        int actual = service.sqr(firstNumber, secondNumber);

        Assertions.assertEquals(expRes, actual);
    }
}
