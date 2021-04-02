import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        int number;
        String res = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 1000: ");
        number = sc.nextInt();
        if (number <= 0 || number >= 1000) {
            res = "Out of ability";
        } else {
            int hundreds = number / 100;
            int left = number % 100, tens = left / 10, ones = left % 10;

            switch (hundreds) {
                case 0:
                    res += "";
                    break;
                case 1:
                    res += "one hundred";
                    break;
                case 2:
                    res += "two hundred";
                    break;
                case 3:
                    res += "three hundred";
                    break;
                case 4:
                    res += "four hundred";
                    break;
                case 5:
                    res += "five hundred";
                    break;
                case 6:
                    res += "six hundred";
                    break;
                case 7:
                    res += "seven hundred";
                    break;
                case 8:
                    res += "eight hundred";
                    break;
                case 9:
                    res += "nine hundred";
                    break;
            }
            res += " ";
            String tenth = "", digit = "";
            switch (tens) {
                case 1:
                    switch (ones) {
                        case 0:
                            tenth = "ten";
                            break;
                        case 1:
                            tenth = "eleven";
                            break;
                        case 2:
                            tenth = "twelve";
                            break;
                        case 3:
                            tenth = "thirteen";
                            break;
                        case 4:
                            tenth = "fourteen";
                            break;
                        case 5:
                            tenth = "fifteen";
                            break;
                        case 6:
                            tenth = "sixteen";
                            break;
                        case 7:
                            tenth = "seventeen";
                            break;
                        case 8:
                            tenth = "eighteen";
                            break;
                        case 9:
                            tenth = "nineteen";
                            break;
                    }
                    break;
                case 0:
                    tenth = "";
                    break;
                case 2:
                    tenth = "twenty ";
                    break;
                case 3:
                    tenth = "thirty ";
                    break;
                case 4:
                    tenth = "forty ";
                    break;
                case 5:
                    tenth = "fifty ";
                    break;
                case 6:
                    tenth = "sixty ";
                    break;
                case 7:
                    tenth = "seventy ";
                    break;
                case 8:
                    tenth = "eighty ";
                    break;
                case 9:
                    tenth = "ninety ";
                    break;
            }
            switch (ones) {
                case 0:
                    digit = "";
                    break;
                case 1:
                    digit = "one";
                    break;
                case 2:
                    digit = "two";
                    break;
                case 3:
                    digit = "three";
                    break;
                case 4:
                    digit = "four";
                    break;
                case 5:
                    digit = "five";
                    break;
                case 6:
                    digit = "six";
                    break;
                case 7:
                    digit = "seven";
                    break;
                case 8:
                    digit = "eight";
                    break;
                case 9:
                    digit = "nine";
                    break;
            }
            if (tens == 1) {
                res += tenth;
            } else {
                res += tenth + digit;
            }
        }
        System.out.println(res);
    }
}
