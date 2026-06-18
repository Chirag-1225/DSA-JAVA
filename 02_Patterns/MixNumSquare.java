package Patterns;

public class MixNumSquare {
    public static void main(String[] args) {
        int n = 7;
        int m = 7;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(i==1||j==1||i==7||j==7){
                   System.out.print("4"+" ");
                }else if(i==2||j==2||i==6||j==6){
                    System.out.print("3"+" ");
                }else if(i==3||j==5||i==5||j==3){
                    System.out.print("2"+" ");
                }else{
                    System.out.print("1"+" ");
                }
                
                
            
            }
            System.out.println();
        }
    
    }
}
