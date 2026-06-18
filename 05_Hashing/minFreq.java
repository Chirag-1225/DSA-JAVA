package Strivers;

import java.util.HashMap;

public class minFreq {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,1,4};
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int minfreq = Integer.MAX_VALUE;
        int answer = -1;
        for(Integer key:map.keySet()){
            if(map.get(key)>0){
                minfreq=map.get(key);
                answer = key;
            }
        }
        System.out.println(minfreq);
        System.out.println(answer);
    }
}
