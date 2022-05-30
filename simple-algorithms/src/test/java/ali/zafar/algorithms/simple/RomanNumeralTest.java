package ali.zafar.algorithms.simple;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RomanNumeralTest {
    
    @Test
    public void test_100_in_romanNumeral_equals_C(){
        String romanNumeral = RomanNumeral.fromDecimal(100);
        System.out.println(romanNumeral);
        assertThat(romanNumeral).isEqualTo("C");
    }

    @Test
    public void test_101_in_romanNumeral_equals_CI(){
        String romanNumeral = RomanNumeral.fromDecimal(101);
        System.out.println(romanNumeral);
        assertThat(romanNumeral).isEqualTo("CI");
    }

    @Test
    public void test_3_in_romanNumeral_equals_III(){
        String romanNumeral = RomanNumeral.fromDecimal(3);
        System.out.println(romanNumeral);
        assertThat(romanNumeral).isEqualTo("III");
    }
}
