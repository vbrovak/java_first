package ru_next;
import java.util.Scanner;
public class ConsolUserInput implements UserInput {
     public int read(int total) {
        int ERROR_INPUT_INT = -1000000;
        int a;
        a = ERROR_INPUT_INT;
        do {
            System.out.println("Введите ответ (1 - " + total + "), 0 - прервать задачу");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                if (a == 0) {
                    return(-1);
                }
                if (a < 0 || a > total) {
                    a = ERROR_INPUT_INT;
                }
            } else {
                a = ERROR_INPUT_INT;
            }
        }
        while (a == ERROR_INPUT_INT);
        return (a);
    }
}
