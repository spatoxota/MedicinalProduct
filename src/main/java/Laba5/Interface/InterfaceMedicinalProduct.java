package Laba5.Interface;
import Laba5.Enum.Status;
public interface InterfaceMedicinalProduct {
	public void addActiveSubstance(String substance); 
	public double calculateDosage(double input); 
	public void researchSubstance(); 
	public void changeStatus(Status status); 
	public String getSubstanceInfo(); 
	public void updateSubstanceInfo(String newInfo); 
	
}
