package Strivers;

import java.util.HashMap;

public class highestfreqch {
    public static void main(String[] args) {
        String str = "aabbbccdde";
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int maxfreq = 0;
        char answer = ' ';
        for(Character key: map.keySet()){
            if(map.get(key)>maxfreq){
                maxfreq = map.get(key);
                answer = key;
            }
        }
        System.out.println("Max freq:"+maxfreq);
        System.out.println("Max Freq Character:"+answer);
    }
}
