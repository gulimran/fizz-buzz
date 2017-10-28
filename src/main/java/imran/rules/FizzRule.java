package imran.rules;

public class FizzRule {

    private static final String LABEL = "fizz";

    private Integer count;

    public FizzRule() {
        this.count = 0;
    }

    public Boolean applies(final Integer number) {
        if (number % 3 == 0) {
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
