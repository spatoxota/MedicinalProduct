package Laba5.Interface.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OintmentImplTest {

    @Test
    void testCalculateDosage() {
        OintmentImpl ointment = new OintmentImpl("TestOintment", "TestInfo", 0.5);
        assertEquals(2.5, ointment.calculateDosage(5.0));
    }

    @Test
    void testResearchSubstance() {
        OintmentImpl ointment = new OintmentImpl("TestOintment", "TestInfo", 0.5);
        ointment.researchSubstance();
        assertTrue(ointment.getResearchStatus());
    }

    @Test
    void testAbsorptionTime() {
        OintmentImpl ointment = new OintmentImpl("TestOintment", "TestInfo", 0.5);
        ointment.absorptionTime(15);
        assertEquals(15, ointment.getAbsorptionTimeInMinutes());
    }

    @Test
    void testGetSubstanceInfo() {
        OintmentImpl ointment = new OintmentImpl("TestOintment", "Info", 0.3);
        ointment.addActiveSubstance("Sub");
        String info = ointment.getSubstanceInfo();
        assertTrue(info.contains("Sub") && info.contains("Препарат"));
    }
}