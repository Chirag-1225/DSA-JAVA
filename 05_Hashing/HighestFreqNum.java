package Strivers;

import java.util.HashMap;

public class maxfreq {
    public static void main(String[] args) {
        int arr[]={1,1,2,1,3,2};
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxFreq=0;
        int answer = -1;
        for(Integer key:map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq = map.get(key);
                answer = key;
            }
        }
        System.out.println("maxfreq : "+maxFreq);
        System.out.println("Answer : "+answer);
        

    }
}
