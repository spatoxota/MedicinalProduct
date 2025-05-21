package Laba5.Interface.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TabletImplTest {

    @Test
    void testCalculateDosage() {
        TabletImpl tablet = new TabletImpl("Tablet", "Info", 1.5);
        assertEquals(7.5, tablet.calculateDosage(5.0));
    }

    @Test
    void testResearchSubstance() {
        TabletImpl tablet = new TabletImpl("Tablet", "Info", 1.5);
        tablet.researchSubstance();
        assertTrue(tablet.getResearchStatus());
    }

    @Test
    void testDissolutionTime() {
        TabletImpl tablet = new TabletImpl("Tablet", "Info", 1.5);
        tablet.dissolutionTime(10);
        assertEquals(10, tablet.getDisolutionTimeInMinutes());
    }

    @Test
    void testRecommendedIntakeTime() {
        TabletImpl tablet = new TabletImpl("Tablet", "Info", 1.5);
        assertEquals("Принимать после еды, чтобы избежать раздражения желудка.", tablet.recommendedIntakeTime());
    }
}