package imran.rules;

public class LuckyRule {

    private static final String LABEL = "lucky";

    private Integer count;

    public LuckyRule() {
        this.count = 0;
    }

    public Boolean applies(final Integer number) {
        if (Integer.toString(number).contains("3")) {
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
