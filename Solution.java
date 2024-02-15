import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
         HashMap<Character, Integer> romanNum = new HashMap<>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for (int i = s.length()-1; i >=0; i--) {
            char c = s.charAt(i);
            int currentValue = romanNum.get(c);

            if (currentValue < prevValue) {
                sum -= currentValue;
            }else{
                sum += currentValue;
            }
            prevValue = currentValue;

        }

        return sum;
    }
}