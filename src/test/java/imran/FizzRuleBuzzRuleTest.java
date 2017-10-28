package imran;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class FizzRuleBuzzRuleTest {

    private FizzBuzz underTest;

    @Before
    public void setup() {
        underTest = new FizzBuzz();
    }

    @Test
    public void itShouldReturnNumberForGivenInteger() {
        // given
        Integer number = 1;

        // when
        String result = underTest.getFizzBuzz(number);

        // then
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void itShouldReturnFizzForNumbersThatAreMultiplesOfThree() {
        // given
        Integer number = 3;

        // when
        String result = underTest.getFizzBuzz(number);

        // then
        assertThat(result).isEqualTo("fizz");
    }

    @Test
    public void itShouldReturnBuzzForNumbersThatAreMultiplesOfFive() {
        // given
        Integer number = 5;

        // when
        String result = underTest.getFizzBuzz(number);

        // then
        assertThat(result).isEqualTo("buzz");
    }

    @Test
    public void itShouldReturnFizzBuzzForNumbersThatAreMultiplesOfFifteen() {
        // given
        Integer number = 15;

        // when
        String result = underTest.getFizzBuzz(number);

        // then
        assertThat(result).isEqualTo("fizzbuzz");
    }

    @Test
    public void itShouldReturnFizzBuzzSequenceForGivenRangeOfNumbers() {
        // given
        List<Integer> numbers = IntStream.range(1, 21).boxed().collect(Collectors.toList());
        StringBuilder result = new StringBuilder();

        // when
        for (Integer number : numbers) {
            result.append(underTest.getFizzBuzz(number)).append(" ");
        }

        // then
        assertThat(result.toString().trim()).isEqualTo("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz");
    }

    @Test
    public void itShouldReturnLuckyForNumbersThatContainThree() {
        // given
        Integer number = 3;

        // when
        String result = underTest.getFizzBuzzLucky(number);

        // then
        assertThat(result).isEqualTo("lucky");
    }

    @Test
    public void itShouldReturnFizzBuzzLuckySequenceForGivenRangeOfNumbers() {
        // given
        List<Integer> numbers = IntStream.range(1, 21).boxed().collect(Collectors.toList());
        StringBuilder result = new StringBuilder();

        // when
        for (Integer number : numbers) {
            result.append(underTest.getFizzBuzzLucky(number)).append(" ");
        }

        // then
        assertThat(result.toString().trim()).isEqualTo("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz");
    }

    @Test
    public void itShouldReturnReportForFizzBuzzLuckySequenceForGivenRangeOfNumbers() {
        // given
        List<Integer> numbers = IntStream.range(1, 21).boxed().collect(Collectors.toList());
        StringBuilder result = new StringBuilder();

        // when
        for (Integer number : numbers) {
            result.append(underTest.getFizzBuzzLucky(number)).append(" ");
        }

        // then
        assertThat(result.toString().trim()).isEqualTo("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz");
        assertThat(underTest.getReport()).isEqualTo("fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10");
    }

}