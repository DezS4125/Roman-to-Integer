import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        LinkedHashMap<Character, Integer> romanDecimal = new LinkedHashMap<>();
        romanDecimal.put('I',1);
        romanDecimal.put('V',5);
        romanDecimal.put('X',10);
        romanDecimal.put('L',50);
        romanDecimal.put('C',100);
        romanDecimal.put('D',500);
        romanDecimal.put('M',1000);
        String test="MCMXCIV";
        System.out.println(romanDecimal);
        for (int i=0;i<test.length()-1;i++) {
            char curRoman = test.charAt(i);
            char nextRoman = test.charAt(i + 1);
            int curInt = romanDecimal.get(curRoman);
            int nextInt = romanDecimal.get(nextRoman);
            if (curInt >= nextInt) {
                sum += curInt;
            }
            if (curInt < nextInt) {
                sum -= curInt;
            }
        }
        sum+=romanDecimal.get(test.charAt(test.length()-1));
        System.out.println(sum);
        System.out.println(sum);
    }
}