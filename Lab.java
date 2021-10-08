/**
 * Lab class with some specifics and an array of enrolled students
 */
public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     *
     * @param cap lab capacity field
     * @param d current day field
     */
    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
        currentSize = 0;
        students = new Student[capacity];
    }

    /**
     *
     * @param std the student that we want to add to the lab
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * prints first name , ID and grade of every student
     */
    public void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println("std fname: " + students[i].getFirstName() + " std id:" + students[i].getId() +
                    " std grade:"+ students[i].getGrade());
        }
        System.out.println("Lab AVG:" + avg);
    }




    /**
     *
     * @return all student objects as an array
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     *
     * @param students set the array of al students of the lab
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     *
     * @return avg grade of lab students
     */
    public int getAvg() {
        return avg;
    }

    /**
     * calculates lab's average grade
     */
    public void calculateAvg() {
        int sum=0;
        for (int i = 0; i < currentSize; i++) {
            sum += students[i].getGrade();
        }
        sum /= currentSize;
        avg = sum;
    }

    /**
     *
     * @return day field
     */
    public String getDay() {
        return day;
    }

    /**
     *
     * @param day set day field
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     *
     * @return lab's capacity field
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @param capacity set capacity field
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}