package imran.rules;

public class BuzzRule {

    private static final String LABEL = "buzz";

    private Integer count;

    public BuzzRule() {
        this.count = 0;
    }

    public Boolean applies(final Integer number) {
        if (number % 5 == 0) {
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
