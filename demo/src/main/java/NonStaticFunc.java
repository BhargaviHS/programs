/*
This class was created to demonstrate the usage of static keyword in a function that adds two integers and returns their sum
* */
public class NonStaticFunc {
    public static void main(String[] args) {
        NonStaticFunc obj=new NonStaticFunc();
        System.out.println("The sum of the numbers is "+obj.sum(12, 13));
    }
    public int sum(int a, int b){
        return a+b;
    }
}
