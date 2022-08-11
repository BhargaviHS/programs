public class Function {
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("The sum of the numbers is "+sum(12, 13));
        System.out.println("The sum of the numbers is "+sum(1, -1));
        System.out.println("The sum of the numbers is "+sum(0, 13));
        System.out.println("The sum of the numbers is "+sum(-12, 13));
        System.out.println("The sum of the numbers is "+sum(112, 13));
    }
}
