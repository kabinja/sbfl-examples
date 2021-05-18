package lu.uni.serval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {

    @Test
    void testRomanToIntEmpty(){
        assertEquals(0, Convertor.romanToInt(""));
    }

    @Test
    void testRomanToInti() {
        assertEquals(1, Convertor.romanToInt("i"));
    }

    @Test
    void testRomanToIntInvalid(){
        assertEquals(-1, Convertor.romanToInt("AI"));
    }

    @Test
    void testRomanToIntI(){
        assertEquals(1, Convertor.romanToInt("I"));
    }

    @Test
    void testRomanToIntII(){
        assertEquals(2, Convertor.romanToInt("II"));
    }

    @Test
    void testRomanToIntIII(){
        assertEquals(3, Convertor.romanToInt("III"));
    }

    @Test
    void testRomanToIntIV(){
        assertEquals(4, Convertor.romanToInt("IV"));
    }

    @Test
    void testRomanToIntV(){
        assertEquals(5, Convertor.romanToInt("V"));
    }


    @Test
    void testRomanToIntXL(){
        assertEquals(40, Convertor.romanToInt("XL"));
    }

    @Test
    void testRomanToIntXXIV(){
        assertEquals(24, Convertor.romanToInt("XXIV"));
    }

    @Test
    void testRomanToIntVI(){
        assertEquals(6, Convertor.romanToInt("VI"));
    }

    @Test
    void testRomanToIntMDCLXVI(){
        assertEquals(1666, Convertor.romanToInt("MDCLXVI"));
    }
}