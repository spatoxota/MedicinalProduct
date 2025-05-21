package Laba5.Interface.impl;

import Laba5.Interface.TabletCharacteristics;

public class TabletImpl extends AbstractMedicinalProduct implements TabletCharacteristics{
	private double dosageFactor;
	public TabletImpl(String name, String substanceInfo, double dosageFactor) {
        super(name, substanceInfo);
        this.dosageFactor = dosageFactor;
    }

    @Override
    public double calculateDosage(double weight) {
        return weight * dosageFactor;
    }

    @Override
    public void researchSubstance() {
    	this.researchStatus = true;
        
    }
    @Override
    public void dissolutionTime(int timeInMinutes) {
    	this.disolutionTimeInMinutes = timeInMinutes;
    }
    @Override
    public String recommendedIntakeTime() {
        return "Принимать после еды, чтобы избежать раздражения желудка.";
    }
}
