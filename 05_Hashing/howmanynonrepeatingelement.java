package Strivers;

import java.util.HashMap;

public class howmanynonrepeatingelement {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,3,4,5,4};
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i< arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                count++;
                
            }
            
        }
        System.out.println(count);
        
    }
}
