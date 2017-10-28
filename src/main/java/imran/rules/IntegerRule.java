package imran.rules;

public class IntegerRule {

    private Integer count;

    public IntegerRule() {
        this.count = 0;
    }

    public String get(final Integer number) {
        count++;
        return Integer.toString(number);
    }

    public Integer getCount() {
        return count;
    }
}
