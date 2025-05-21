package Laba5.Interface.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionImplTest {

    @Test
    void testCalculateDosage() {
        SolutionImpl solution = new SolutionImpl("TestSolution", "Info", 0.2);
        assertEquals(2.0, solution.calculateDosage(10.0));
    }

    @Test
    void testResearchSubstance() {
        SolutionImpl solution = new SolutionImpl("TestSolution", "Info", 0.2);
        solution.researchSubstance();
        assertTrue(solution.getResearchStatus());
    }

    @Test
    void testExpirationAfterOpening() {
        SolutionImpl solution = new SolutionImpl("TestSolution", "Info", 0.2);
        solution.expirationAfterOpening(5);
    }
}