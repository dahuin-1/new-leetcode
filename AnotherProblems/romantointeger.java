package AnotherProblems;

public class romantointeger {

    public int romanToInt(String s) {
        int result = 0;
        while (!s.equals("")) {
            if (s.contains("IV")) {
                result += 4;
                s = s.replace("IV", "");
            }
            if (s.contains("IX")) {
                result += 9;
                s = s.replace("IX", "");
            }
            if (s.contains("XL")) {
                result += 40;
                s = s.replace("XL","");
            }
            if (s.contains("XC")) {
                result += 90;
                s = s.replace("XC", "");
            }
            if (s.contains("CD")) {
                result += 400;
                s = s.replace("CD", "");
            }
            if (s.contains("CM")) {
                result += 900;
                s = s.replace("CM", "");
            }
            if (s.contains("I")) {
                result += 1;
                s = s.replaceFirst("I","");
            }
            if (s.contains("V")) {
                result += 5;
                s = s.replaceFirst("V", "");
            }
            if (s.contains("X")) {
                result += 10;
                s = s.replaceFirst("X", "");
            }
            if (s.contains("L")) {
                result += 50;
                s = s.replaceFirst("L", "");
            }
            if (s.contains("C")) {
                result += 100;
                s = s.replaceFirst("C", "");
            }
            if (s.contains("D")) {
                result += 500;
                s = s.replaceFirst("D", "");
            }
            if (s.contains("M")) {
                result += 1000;
                s = s.replaceFirst("M", "");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        romantointeger r = new romantointeger();
        System.out.println( r.romanToInt("LVIII"));
    }
}

