import java.util.Scanner;

public class FixedSizeArray {
    public static void main(String[] args) {
        //int[] nums=new int[10];
        for (int i=0;i<100;i+=2){
            System.out.println(i);
        }
        for (int i=0;i<100;i+=3){
            System.out.println(i);
        }
        /*int v=5;
        while(v>0){
            System.out.println(v);
        }//drawbacks of while loop
        */
        int v=05;
        while(v>0){
            System.out.println(v);
            v--;
        }
        v=0;
        do{
            System.out.println(v);
            v--;
        }while(v>0);

    }

}
