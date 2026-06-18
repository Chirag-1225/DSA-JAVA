package Strivers;

public class Loops {
    public static void main(String[] args) {
        int low = 1;
        int high = 5;
        System.out.println(forLoop(low,high));
        
    }
    public static int forLoop(int low, int high) {
        // Your code goes here
        int sum = 0;
        for (int i=low;i<=high;i++){
            sum += i;
        }
        return sum;
        
    }
}
