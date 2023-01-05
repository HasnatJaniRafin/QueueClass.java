//Name : Hasnat Jani Rafin
// ID  : 20172507
import java.util.Scanner;
class Queue{
    private int[] element = null;
    private int size  = 0 ;
    private int numberOfElements = 0;
    public Queue(){
        element = new int[8];
        numberOfElements = 8;size = 0;}
    public void enqueue(int value){
        if (numberOfElements==size){
            numberOfElements = element.length*2;
            int [] temp = new int[numberOfElements];
            System.arraycopy(element,0,temp,0,element.length); element = temp;}
            element[size++]=value;
    }
    public int dequeue(){
        int res = element[0];
        for (int i = 0 , j = i + 1 ;j < size;i++,j++) {
            element[i] = element[j];};
        size--;return res;
    }
    public boolean empty(){return size==0;}
    public int getSize(){
                        return size;}
}
public class QueueClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue que = new Queue();
        for (int i = 1; i < 21 ; i++){que.enqueue(i);System.out.println("add element " +i +" ");}
        int time  = que.getSize();
        System.out.println(" ## The elements from Queue to be removed are");
        for (int i = 0;i<time;i++){System.out.print(que.dequeue()+"   ");}
        System.out.println("");System.out.println(" ## Whether the Queue is empty : "+que.empty());
    }
}