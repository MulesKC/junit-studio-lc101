package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void singleCorrectBrackets() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[Chiefs]"));

    }

    @Test
    public void missingCloseBracket() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("[Chiefs"));

    }

    @Test
    public void missingOpenBracket() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("Chiefs]"));

    }

    @Test
    public void noBrackets() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("Chiefs"));

    }

    @Test
    public void bracketsWrongOrderBeforeWord() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("][Chiefs"));

    }

    @Test
    public void bracketsWrongOrderAfterWord() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("Chiefs]["));

    }

    @Test
    public void emptyString() {

        assertTrue(BalancedBrackets.hasBalancedBrackets(""));

    }

    @Test
    public void twoCorrectBracketSets() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[Kansas] [City]"));

    }

    @Test
    public void threeCorrectNestedBrackets() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[Kansas[City[Chiefs]]]"));

    }

    @Test
    public void nestedMissingCloseBracket() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("[Hello[World[]]"));

    }

    @Test
    public void nestedMissingOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Hello[World]]]"));
    }

    @Test
    public void twoSetsWithinBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Kansas] [City]]"));
    }



}
