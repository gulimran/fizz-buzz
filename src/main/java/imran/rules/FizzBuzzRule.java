package imran.rules;

public class FizzBuzzRule {

    private static final String LABEL = "fizzbuzz";

    private Integer count;

    public FizzBuzzRule() {
        this.count = 0;
    }

    public Boolean applies(final Integer number) {
        if (number % 15 == 0) {
            count++;
            return true;
        }
        return false;
    }

    public String get() {
        return LABEL;
    }

    public Integer getCount() {
        return count;
    }
}
