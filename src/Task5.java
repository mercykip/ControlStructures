import java.util.Scanner;

public class Task5 {



    public static void main(String[] args) {
        int number = 200;
        new Task5().start(number);
    }

    // TODO: 7/17/2020
    private  void start(int number) {
        int original=number;
        char c[] = new char[10001];
        int i = 0;

        if (number <= 0) {
            System.out.println("Invalid number");
            return;
        }

        while (number != 0) {
            if (number >= 1000) {
                // Add 'M' number/1000 times after index i
                i = digit('M', number / 1000, i, c);
                number = number % 1000;
            }
            else if (number >= 500) {
                if (number < 900) {
                    // Add 'D' number/1000 times after index i
                    i = digit('D', number / 500, i, c);
                    number = number % 500;
                }
                else {
                    // Add C and M after index i/.
                    i = subDigit('C', 'M', i, c);
                    number = number % 100;
                }
            }
            else if (number >= 100) {
                if (number < 400) {
                    i = digit('C', number / 100, i, c);
                    number = number % 100;
                }
                else {
                    i = subDigit('C', 'D', i, c);
                    number = number % 100;
                }
            }
            else if (number >= 50) {
                if (number < 90) {
                    i = digit('L', number / 50, i, c);
                    number = number % 50;
                }
                else {
                    i = subDigit('X', 'C', i, c);
                    number = number % 10;
                }
            }
            else if (number >= 10) {
                if (number < 40) {
                    i = digit('X', number / 10, i, c);
                    number = number % 10;
                }
                else {
                    i = subDigit('X', 'L', i, c);
                    number = number % 10;
                }
            }
            else if (number >= 5) {
                if (number < 9) {
                    i = digit('V', number / 5, i, c);
                    number = number % 5;
                } else {
                    i = subDigit('I', 'X', i, c);
                    number = 0;
                }
            } // If base value of number is greater than or equal to 1
            else {
                if (number < 4) {
                    i = digit('I', number, i, c);
                    number = 0;
                } else {
                    i = subDigit('I', 'V', i, c);
                    number = 0;
                }
            }
        }

        System.out.print(String.format("%s to roman is: ",original));
        for (int j = 0; j < i; j++) {
            System.out.printf("%c", c[j]);
        }
    }

    // TODO: 7/17/2020
    private  int subDigit(char num1, char num2, int i, char[] c) {
        c[i++] = num1;
        c[i++] = num2;
        return i;
    }

    // TODO: 7/17/2020
    private  int digit(char ch, int n, int i, char[] c) {
        for (int j = 0; j < n; j++) {
            c[i++] = ch;
        }
        return i;
    }
    }



