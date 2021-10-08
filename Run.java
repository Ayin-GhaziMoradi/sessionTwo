import java.io.*;
/**
 * <strong>This is a oop practice file for the 2nd session of AP lab</strong>
 * <p> the Run class is the main class to use other classes and see the effects with</p>
 */
public class Run {
    /**
    * @param args currently has no use
     */
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");

        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        System.out.println("\ninitializing firstLab object and testing it : \n");

        Lab firstLab = new Lab(3 , "Mehr 17th");
        firstLab.enrollStudent(std1);
        firstLab.enrollStudent(std2);
        firstLab.enrollStudent(std3);

        firstLab.calculateAvg();

        firstLab.print();

        System.out.println("\ntesting whether objects are called by reference or not : \n");
        Student std4 = std1;
        std1.print();
        std4.setId("0000000");
        std1.print();

        System.out.println("\ntesting our college class : \n");
        College CE = new College(3);
        CE.addLab(firstLab);
        CE.print();
        CE.printNthAvg(0);
    }
}
