public class FizzBuzz {

    public String fizzBuzz(int input) {
        StringBuilder sb = new StringBuilder();
        if (input % 3 == 0) {
            sb.append("Fizz");
        }
        if (input % 5 == 0) {
            sb.append("Buzz");
        }
        return sb.toString();
    }

}
