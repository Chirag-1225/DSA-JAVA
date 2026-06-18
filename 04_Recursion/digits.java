public class digits {
    public static void counts(int n,int count){
          if(n==0){
            System.out.println(count);
            return;
          }
          counts(n/10, count+1);
          

          
    }
    public static void main(String[] args) {
        counts(1235465544, 0);
    }
}
