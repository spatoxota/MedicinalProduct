package Laba5.Interface.impl;

import Laba5.Interface.SolutionCharacteristics;

public class SolutionImpl extends AbstractMedicinalProduct implements SolutionCharacteristics{
	private double concentration;
	public SolutionImpl(String name, String substanceInfo, double concentration) {
        super(name, substanceInfo);
        this.concentration = concentration;
    }

    @Override
    public double calculateDosage(double volume) {
        return volume * concentration; 
    }

    @Override
    public void researchSubstance() {
    	this.researchStatus = true;
        
    }
    @Override
    public void expirationAfterOpening(int numberOfDays) {
    	this.expirationAfterOpening = numberOfDays;
    	
    }
    
}
