package Laba5.app;

import java.util.ArrayList;


import Laba5.Interface.impl.*;
import Laba5.Enum.Status;

public class Main {
	
    public static void main(String[] args) {
    	
    	ArrayList<AbstractMedicinalProduct> medicines = new ArrayList<>();

        TabletImpl tablet = new TabletImpl("��������", "�������������� ��������", 1.5);
        tablet.addActiveSubstance("���������");
        tablet.changeStatus(Status.BY_PRESCRIPTION);
        medicines.add(tablet);

        OintmentImpl ointment = new OintmentImpl("��������", "����������� ����", 0.2);
        ointment.addActiveSubstance("������������");
        medicines.add(ointment);

        SolutionImpl solution1 = new SolutionImpl("����������", "��� ������������� ��������", 0.3);
        solution1.addActiveSubstance("������ ������");
        solution1.changeStatus(Status.PROHIBITED);
        medicines.add(solution1);
        
        
        SolutionImpl solution2 = new SolutionImpl("������� �������", "��� ������� � ������������", 0.5);
        solution2.addActiveSubstance("������ ������, ����� ������, ������� ������, ������ ������");
        solution2.changeStatus(Status.BY_PRESCRIPTION);
        medicines.add(solution2);



        
        System.out.println("���������, ��������� �� �������:");
        for (AbstractMedicinalProduct medicine : medicines) {
            if (medicine.getStatus() == Status.BY_PRESCRIPTION) {
                System.out.println(medicine.getSubstanceInfo());
            }
        }
    }
}





















//private static final int WEIGHT = 60;
//private static final int VOLUME = 30;
//private static final int AREA = 4;

//        TabletImpl tablet = new TabletImpl("��������", "�������������� ��������");
//        tablet.addActiveSubstance("���������");
//        tablet.updateSubstanceInfo("��������������������� ��������");
//        tablet.changeStatus("�� �������");
//        System.out.println("���������: " + tablet.calculateDosage(WEIGHT) + " ��");
//        System.out.println(tablet.recommendedIntakeTime());
//        System.out.println(tablet.getSubstanceInfo());
//        System.out.println(tablet.getDisolutionTimeInMinutes());
//        System.out.println("\n----------------------\n");
//
//        OintmentImpl ointment = new OintmentImpl("��������", "����������� ����");
//        ointment.addActiveSubstance("������������");
//        ointment.updateSubstanceInfo("�������� � ��������� ����");
//        
//        System.out.println(ointment.getSubstanceInfo());
//        System.out.println("���������: " + ointment.calculateDosage(AREA) + " �");
//        ointment.researchSubstance();
//        System.out.println(ointment.getSubstanceInfo());
//
//        System.out.println("\n----------------------\n");
//
//        SolutionImpl solution = new SolutionImpl("����������", "��� ������������� ��������");
//        solution.addActiveSubstance("������ ������");
//        solution.updateSubstanceInfo("������������ ��� ������� � ����������");
//        solution.changeStatus("���������");        
//        System.out.println(solution.getSubstanceInfo());
//        System.out.println("���������: " + solution.calculateDosage(VOLUME) + " ��");
//        solution.researchSubstance();
//        
//    }
//}
