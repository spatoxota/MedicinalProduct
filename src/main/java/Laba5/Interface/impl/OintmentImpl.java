package Laba5.Interface.impl;
import Laba5.Interface.OintmentCharacteristics;

public class OintmentImpl extends AbstractMedicinalProduct implements OintmentCharacteristics {
    private double layer;

    public OintmentImpl(String name, String substanceInfo, double layer) {
        super(name, substanceInfo);
        this.layer = layer; 
    }

    @Override
    public double calculateDosage(double area) {
        return area * layer;
    }

    @Override
    public void researchSubstance() {
    	this.researchStatus = true;
    	
    }
    @Override
    public void absorptionTime(int timeInMinutes) {
    	this.absorptionTimeInMinutes = timeInMinutes;
    }
    @Override 
    public void recordSkinReaction(String reaction) {
        this.skinReaction = reaction;
        
    }

}
