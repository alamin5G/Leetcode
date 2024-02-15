class Solution {
    public String longestCommonPrefix(String[] strs) {
         //finding the smallest string length from the array 
         int smallestLength = strs[0].length();

         for (String string : strs) {
             if (smallestLength > string.length()) {
                 smallestLength = string.length();
             }
         }
 
         int countt = 0;
         boolean b = false;
         String s = "";
 
         for (int i = 0; i < smallestLength; i++) {
 
             char pref = strs[0].charAt(i);
 
             for (int j = 0; j < strs.length; j++) {
                 
                 if (pref == strs[j].charAt(i)) {
                      b = true;
                 }else{
                     b = false;
                     break;
                 }
             }
 
             if (b == true) {
                 s = s + String.valueOf(pref);
                 countt++;
             }else{
                 if (countt>=1) {
                     return s;
                 }else{
                     return "";
                 }
             }
 
         }
         return s;
     }
}