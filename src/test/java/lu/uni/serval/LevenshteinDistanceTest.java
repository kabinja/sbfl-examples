package lu.uni.serval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevenshteinDistanceTest {
    @Test
    void testSameWordDistanceIsZero(){
        assertEquals(0., Distance.levenshtein("someWord", "someWord"));
    }

    @Test
    void testAddOneLetterWordDistanceIsOne(){
        assertEquals(0., Distance.levenshtein("someWord", "someWord1"));
    }
}