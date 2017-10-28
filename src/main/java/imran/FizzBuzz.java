package imran;

import imran.rules.BuzzRule;
import imran.rules.FizzBuzzRule;
import imran.rules.FizzRule;
import imran.rules.IntegerRule;
import imran.rules.LuckyRule;

public class FizzBuzz {

    private final FizzRule fizzRule;
    private final BuzzRule buzzRule;
    private final FizzBuzzRule fizzBuzzRule;
    private final LuckyRule luckyRule;
    private final IntegerRule integerRule;

    public FizzBuzz() {
        this.fizzRule = new FizzRule();
        this.buzzRule = new BuzzRule();
        this.fizzBuzzRule = new FizzBuzzRule();
        this.luckyRule = new LuckyRule();
        this.integerRule = new IntegerRule();
    }

    public String getFizzBuzz(Integer number) {
        if (fizzBuzzRule.applies(number)) {
            return fizzBuzzRule.get();
        }

        if (buzzRule.applies(number)) {
            return buzzRule.get();
        }

        if (fizzRule.applies(number)) {
            return fizzRule.get();
        }

        return integerRule.get(number);
    }

    public String getFizzBuzzLucky(Integer number) {
        if (luckyRule.applies(number)) {
            return luckyRule.get();
        }
        return getFizzBuzz(number);
    }

    public String getReport() {
        StringBuilder builder = new StringBuilder();

        builder.append(fizzRule.get()).append(": ").append(fizzRule.getCount()).append(" ");
        builder.append(buzzRule.get()).append(": ").append(buzzRule.getCount()).append(" ");
        builder.append(fizzBuzzRule.get()).append(": ").append(fizzBuzzRule.getCount()).append(" ");
        builder.append(luckyRule.get()).append(": ").append(luckyRule.getCount()).append(" ");
        builder.append("integer: ").append(integerRule.getCount());
        return builder.toString();
    }

}
