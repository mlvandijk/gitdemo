import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void DivisibleByThreeShouldReturnFizz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(3);
        assertEquals("Fizz", actual);
    }

    @Test
    public void DivisibleByFiveShouldReturnBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(3);
        assertEquals("Fizz", actual);
    }

    @Test
    public void DivisibleByThreeAndFiveShouldReturnFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(15);
        assertEquals("FizzBuzz", actual);
    }


}
