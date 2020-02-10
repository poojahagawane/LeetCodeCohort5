import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        Set<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u","A","E","I","O","U"));
        StringBuilder ans = new StringBuilder(s);
        int i = 0, j = s.length()-1;
        while(j > i)    {
            if(vowels.contains(String.valueOf(s.charAt(i))) && vowels.contains(String.valueOf(s.charAt(j))))    {
                ans.setCharAt(i,s.charAt(j));
                ans.setCharAt(j,s.charAt(i));
                i++;
                j--;
            }
            else if(!vowels.contains(String.valueOf(s.charAt(i))))   {
                i++;
            } else  {
                j--;
            }

        }
        return ans.toString();
    }
}
