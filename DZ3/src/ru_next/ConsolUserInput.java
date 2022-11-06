package ru_next;
import java.util.Scanner;
public class ConsolUserInput implements UserInput {
     public int read(int maxValue) {
        int ERROR_INPUT_INT = -1000000;
        int ZERO_VALUE = 0;
        int anwserIntCode = ERROR_INPUT_INT;
        do {
            System.out.println("Введите ответ (1 - " + maxValue + "), 0 - прервать задачу");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                anwserIntCode = sc.nextInt();
                if (anwserIntCode == ZERO_VALUE) {
                    return -1;
                }
                if (anwserIntCode < ZERO_VALUE || anwserIntCode > maxValue) {
                    anwserIntCode = ERROR_INPUT_INT;
                }
            } else {
                anwserIntCode = ERROR_INPUT_INT;
            }
        }
        while (anwserIntCode == ERROR_INPUT_INT);
        return anwserIntCode;
    }
}
