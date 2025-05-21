package Laba5.Interface.impl;

import Laba5.Interface.InterfaceMedicinalProduct;
import Laba5.Enum.*;

public abstract class AbstractMedicinalProduct implements InterfaceMedicinalProduct {
	

	protected String name;
    protected String activeSubstance;
    protected Status status;
    protected String substanceInfo; 
    protected int absorptionTimeInMinutes;
    protected boolean researchStatus;
    protected int disolutionTimeInMinutes;
    protected String skinReaction; 
    protected int expirationAfterOpening;
    
    
    
    public AbstractMedicinalProduct(String name, String substanceInfo) {
        this.name = name;
        this.status = Status.ALLOWED;
        this.substanceInfo = substanceInfo;
        this.researchStatus = false;
        
    }

    @Override
    public void addActiveSubstance(String substance) {
        this.activeSubstance = substance;
    }

    @Override
    public void changeStatus(Status status) {
    	this.status = status;
    }

    @Override
    public String getSubstanceInfo() {
        return "Препарат: " + name + ", Вещество: " + activeSubstance + ", Статус: " + status.getStatusName() + ", Инфо: " + substanceInfo;
    }

    @Override
    public void updateSubstanceInfo(String newInfo) {
        this.substanceInfo = newInfo;
    }

    
    @Override
    public abstract double calculateDosage(double input);

    @Override
    public abstract void researchSubstance();
    
  

    
    public boolean getResearchStatus() {
        return researchStatus;
    }
    
    public int getAbsorptionTimeInMinutes() {
		return absorptionTimeInMinutes;
	}
    
    public int getDisolutionTimeInMinutes() {
		return disolutionTimeInMinutes;
	}
    
    public Status getStatus() {
		return status;
	}

}
