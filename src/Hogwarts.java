public class Hogwarts {
    public void printStudent(HogwartsStudent student) {
        System.out.println(student);
    }

    public void compareGryffindorStudents (Gryffindor first, Gryffindor second){
        int firstSum = first.getBravery()+ first.getNobility()+ first.getHonor();
        int secondSum = second.getBravery()+ second.getNobility()+ second.getHonor();

        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " сильнее чем " + second.getName());
        }else if (firstSum == secondSum) {
            System.out.println("Студенты " + second.getName() + " и " + second.getName() + " равны.");
        }else {
            System.out.println("Студент " + second.getName() + " сильнее чем " + first.getName());
        }
    }
    public void compareHufflepuffStudents (Hufflepuff first, Hufflepuff second){
        int firstSum = first.getHardwork()+ first.getIntegrity()+ first.getLoyalty();
        int secondSum = second.getHardwork()+ second.getIntegrity()+ second.getLoyalty();
        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " сильнее чем " + second.getName());
        }else if (firstSum == secondSum) {
            System.out.println("Студенты " + second.getName() + " и " + second.getName() + " равны.");
        }else {
            System.out.println("Студент " + second.getName() + " сильнее чем " + first.getName());
        }
    }
    public void compareRavenclawStudents (Ravenclaw first, Ravenclaw second){
        int firstSum = first.getCreation()+ first.getWit()+ first.getWisdom()+ first.getMind();
        int secondSum = second.getCreation()+ second.getWit()+ second.getWisdom()+ second.getMind();
        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " сильнее чем " + second.getName());
        }else if (firstSum == secondSum) {
            System.out.println("Студенты " + second.getName() + " и " + second.getName() + " равны.");
        }else {
            System.out.println("Студент " + second.getName() + " сильнее чем " + first.getName());
        }
    }
    public void compareSlytherinStudents (Slytherin first, Slytherin second){
        int firstSum = first.getCunning()+ first.getDecisiveness()+ first.getAmbition()+ first.getResourcefulness()+ first.getLustForPower();
        int secondSum = second.getCunning()+ second.getDecisiveness()+ second.getAmbition()+ second.getResourcefulness()+ second.getLustForPower();
        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " сильнее чем " + second.getName());
        }else if (firstSum == secondSum) {
            System.out.println("Студенты " + second.getName() + " и " + second.getName() + " равны.");
        }else {
            System.out.println("Студент " + second.getName() + " сильнее чем " + first.getName());
        }
    }


    public void compareAnyStudents(HogwartsStudent first, HogwartsStudent second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println("Студент " + first.getName() + " сильнее чем " + second.getName());

        } else if (first.getMagicPower() == second.getMagicPower()) {
            System.out.println("Студенты " + first.getName() + second.getName() + " равны по силе.");
        } else {
            System.out.println("Студент " + second.getName() + " сильнее чем " + first.getName());
        }

        if (first.getTransgressionDistance() > second.getTransgressionDistance()) {
            System.out.println("Студент " + first.getName() + " трансгрессирует дальше чем " + second.getName());

        } else if (first.getTransgressionDistance() == second.getTransgressionDistance()) {
            System.out.println("Студенты " + first.getName() + second.getName() + " трансгрессируют одинакого.");
        } else {
            System.out.println("Студент " + second.getName() + " трансгрессирует дальше чем " + first.getName());
        }
    }
}
