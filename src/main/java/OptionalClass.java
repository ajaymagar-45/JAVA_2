import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("Hello");      // value must NOT be null
        Optional<String> opt2 = Optional.ofNullable(null); // allows null
        Optional<String> opt3 = Optional.empty();
        System.out.println(opt1 +" " + opt2 +" "+opt3);// no value

    }
}
