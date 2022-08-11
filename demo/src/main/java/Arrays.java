import java.util.Scanner;

public class Arrays {
    static int a, b;
    public static int sum(){
        return a+b;
    }
    public static void main(String[] args) {
        int[] nums={2, 3, 5, 6, 7, 8, 1};
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);

        }
        //display all numbers on a singeks libe
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");

        }
        //System.out.println("The sum of the numbers is "+sum());
        //System.out.println("The largest number is "+getLargest(a, b));
    }
    public static int getLargest(int a, int b){
        int large=0;//better practice though not req
        if(a>b)large=a;
        else large=b;
        return large;
    }
    public static void getValues(){
        System.out.println("Enter the first number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter the second number");
        b=s.nextInt();

    }
}
