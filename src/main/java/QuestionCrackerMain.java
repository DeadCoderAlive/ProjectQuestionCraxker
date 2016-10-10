import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by srinivaz on 10/9/16.
 */

/**
 * remove Duplicates in a String
 */
public class QuestionCrackerMain {
    public static void removeDuplicates(char[] str) {
        if (str == null) return;
         int len = str.length;
         if (len < 2) return;

         int tail = 1;

         for (int i = 1; i < len; ++i) {
             int j;
             for (j = 0; j < tail; ++j) {
                 if (str[i] == str[j]) break;
                 }
             if (j == tail) {
                 str[tail] = str[i];
                 ++tail;
                 }
             }
         str[tail] = 0;
         }

    /**
     * find anagram or not
     * @param word_1
     * @param word_2
     * @return
     */
    public boolean findAnagramOrNot(String word_1,String word_2) {
        if(word_1.length() != word_2.length()) return false;
        HashMap<String,Integer> word_1_hash = computeHashMapForAnagramSolver(word_1);
        HashMap<String,Integer> word_2_hash = computeHashMapForAnagramSolver(word_2);
    Set<String > keyset = word_1_hash.keySet();
        if(word_1_hash.keySet().equals(word_2_hash.keySet())){
            Set<Map.Entry<String,Integer>> entrySet = word_1_hash.entrySet();
           if(word_1_hash.entrySet().equals(word_2_hash.entrySet())) {
               return true;
           }
        }
        return false;
}

    /**
     * anagram finder helper method to compute hash maps
     * @param word_1
     * @return
     */
    public HashMap<String,Integer> computeHashMapForAnagramSolver(String word_1) {

    HashMap<String,Integer> word_hash = new HashMap<String, Integer>();
    for(int i=0;i<word_1.length();i++){
        String charAt = String.valueOf(word_1.charAt(i));
        if(word_hash.containsKey(charAt)){
            word_hash.put(charAt,word_hash.get(charAt)+1);
        }
        else {
            word_hash.put(charAt,1);
        }
    }
    return word_hash;
}


}

