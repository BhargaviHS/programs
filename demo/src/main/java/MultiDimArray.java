public class MultiDimArray {
    public static void main(String[] args) {
        int[][] nums=new int[8][8];
        int val=0;
        for (int r=0;r<nums.length;r++) {
            for (int c = 0; c < nums[0].length; c++){
                nums[r][c]=val;
                val++;
            }
        }
        for (int r=0;r<nums.length;r++) {
            for (int c = 0; c < nums[0].length; c++){
                System.out.print(nums[r][c]+" ");
            }
            System.out.println();
        }for (int r=0;r<nums.length;r++) {
            for (int c = 0; c < nums[0].length; c++){
                System.out.print(nums[r][c]+"\t");
            }
            System.out.println();
        }

        //chessboard


        for (int r=0;r<nums.length;r++) {
            for (int c = 0; c < nums[0].length; c++){
                nums[r][c]=(r+c)%2;
                val++;
            }
        }
        for (int r=0;r<nums.length;r++) {
            for (int c = 0; c < nums[0].length; c++){
                System.out.print(nums[r][c]+" ");
            }
            System.out.println();
        }for (int r=0;r<nums.length;r++) {
            for (int c = 0; c < nums[0].length; c++){
                System.out.print(nums[r][c]+"\t");
            }
            System.out.println();
        }
    }
}
