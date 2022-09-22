package UtilityTUnitesting;

import static org.junit.jupiter.api.Assertions.*; // importing assertions and tests class 
import org.junit.jupiter.api.Test;

import UtilityTUnitesting.MathUtility; // import class you're trying to test

public class MathUtilityTest {

    @Test 
    public void addTest1() {
        assertEquals(0, MathUtility.add(0,0));
    }
    
    @Test 
    public void addTest2() {
        assertEquals(4, MathUtility.add(2,2));
    }

    @Test 
    public void addTest3() {
        assertEquals(70, MathUtility.add(-12,82));
    }

}
