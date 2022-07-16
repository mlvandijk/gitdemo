import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void ThreeShouldReturnFizz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(3);
        assertEquals("Fizz", actual);
    }

    @Test
    public void FiveShouldReturnBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(3);
        assertEquals("Fizz", actual);
    }
}
