package kunal_kushwaha.dsa.dsa.strings.leetcode;

//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

public class RomanToInteger {
    public static void main(String[] args) {
        int i1 = romanToInt("III");
        System.out.println(i1);

        int i2 = romanToInt("LVIII");
        System.out.println(i2);

        int i3 = romanToInt("MCMXCIV");
        System.out.println(i3);

        int i4 = romanToInt("MDLXX");
        System.out.println(i4);

    }

    static public int romanToInt(String s) {
        int i = 0;
        int sum = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'V') {
                sum += 5;
                i++;
            } else if (s.charAt(i) == 'L') {
                sum += 50;
                i++;
            } else if (s.charAt(i) == 'D') {
                sum += 500;
                i++;
            } else if (s.charAt(i) == 'M') {
                sum += 1000;
                i++;
            }

            // Cases :
            // Case 1 : If i is I;

            else if (s.charAt(i) == 'I') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'V') {
                        sum += 4;
                        i += 2;
                    } else if (s.charAt(i + 1) == 'X') {
                        sum += 9;
                        i += 2;
                    } else {
                        sum += 1;
                        i++;
                    }
                } else {
                    sum += 1;
                    i++;
                }
            }

            // Case 2 : If i is X

            else if (s.charAt(i) == 'X') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'L') {
                        sum += 40;
                        i += 2;
                    } else if (s.charAt(i + 1) == 'C') {
                        sum += 90;
                        i += 2;
                    } else {
                        sum += 10;
                        i++;
                    }

                } else {
                    sum += 10;
                    i++;
                }
            }

            // Case 3 : If i is C

            else if (s.charAt(i) == 'C') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'D') {
                        sum += 400;
                        i += 2;
                    } else if (s.charAt(i + 1) == 'M') {
                        sum += 900;
                        i += 2;
                    } else {
                        sum += 100;
                        i++;
                    }

                } else {
                    sum += 100;
                    i++;
                }

            }

        }
        return sum;
    }
}
