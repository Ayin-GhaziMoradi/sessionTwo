/**
 * this class can process a list of labs
 */
public class College {
    private Lab[] labs;
    private int capacity;
    private int currentSize;

    /**
     *
     * @param cap maximum legal number of labs
     */
    public College(int cap) {
        this.capacity = cap;
        currentSize = 0;
        labs = new Lab[capacity];
    }

    /**
     * we add new labs with this method
     * @param lb desired lab to add to the labs list
     */
    public void addLab(Lab lb) {
        if (currentSize < capacity) {
            labs[currentSize] = lb;
            currentSize++;
        } else {
            System.out.println("There are too many labs!!!");
        }
    }

    /**
     * prints the current number of lab(s) and states the maximum allowed number
     */
    public void print(){
        System.out.println(currentSize + "lab(s) is(are) added to the list while max number of labs is " + capacity);
    }

    /**
     *
     * @param index we will print the (index)th lab's average grade
     */
    public void printNthAvg(int index){
        System.out.println("#" + index + " lab's avg is : " + labs[index].getAvg());
    }
}
