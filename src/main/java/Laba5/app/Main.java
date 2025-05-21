package Laba5.app;

import java.util.ArrayList;


import Laba5.Interface.impl.*;
import Laba5.Enum.Status;

public class Main {
	
    public static void main(String[] args) {
    	
    	ArrayList<AbstractMedicinalProduct> medicines = new ArrayList<>();

        TabletImpl tablet = new TabletImpl("Анальгин", "Обезболивающее средство", 1.5);
        tablet.addActiveSubstance("Метамизол");
        tablet.changeStatus(Status.BY_PRESCRIPTION);
        medicines.add(tablet);

        OintmentImpl ointment = new OintmentImpl("Бепантен", "Заживляющая мазь", 0.2);
        ointment.addActiveSubstance("Декспантенол");
        medicines.add(ointment);

        SolutionImpl solution1 = new SolutionImpl("Физраствор", "Для внутривенного введения", 0.3);
        solution1.addActiveSubstance("Натрий хлорид");
        solution1.changeStatus(Status.PROHIBITED);
        medicines.add(solution1);
        
        
        SolutionImpl solution2 = new SolutionImpl("Раствор Рингера", "Для инфузий и регидратации", 0.5);
        solution2.addActiveSubstance("Натрий хлорид, Калий хлорид, Кальция хлорид, Натрия ацетат");
        solution2.changeStatus(Status.BY_PRESCRIPTION);
        medicines.add(solution2);



        
        System.out.println("Препараты, доступные по рецепту:");
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

//        TabletImpl tablet = new TabletImpl("Анальгин", "Обезболивающее средство");
//        tablet.addActiveSubstance("Метамизол");
//        tablet.updateSubstanceInfo("Противовоспалительное средство");
//        tablet.changeStatus("По рецепту");
//        System.out.println("Дозировка: " + tablet.calculateDosage(WEIGHT) + " мг");
//        System.out.println(tablet.recommendedIntakeTime());
//        System.out.println(tablet.getSubstanceInfo());
//        System.out.println(tablet.getDisolutionTimeInMinutes());
//        System.out.println("\n----------------------\n");
//
//        OintmentImpl ointment = new OintmentImpl("Бепантен", "Заживляющая мазь");
//        ointment.addActiveSubstance("Декспантенол");
//        ointment.updateSubstanceInfo("Защищает и увлажняет кожу");
//        
//        System.out.println(ointment.getSubstanceInfo());
//        System.out.println("Дозировка: " + ointment.calculateDosage(AREA) + " г");
//        ointment.researchSubstance();
//        System.out.println(ointment.getSubstanceInfo());
//
//        System.out.println("\n----------------------\n");
//
//        SolutionImpl solution = new SolutionImpl("Физраствор", "Для внутривенного введения");
//        solution.addActiveSubstance("Натрий хлорид");
//        solution.updateSubstanceInfo("Используется для инфузий и промываний");
//        solution.changeStatus("Запрещено");        
//        System.out.println(solution.getSubstanceInfo());
//        System.out.println("Дозировка: " + solution.calculateDosage(VOLUME) + " мл");
//        solution.researchSubstance();
//        
//    }
//}
