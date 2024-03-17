package part2.ch1;

import java.util.HashMap;

public class CharacterCount {
    // 6
    public static void main(String[] args) {
        String str = "Hello,World!";
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = str.toCharArray();

        for (char c:strArray){
            if (charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }else {
                charCountMap.put(c,1);
            }
        }

        System.out.println("Character Counts: ");
        for (char c: charCountMap.keySet()){
            System.out.println(c+": "+charCountMap.get(c));
        }
    }
}
