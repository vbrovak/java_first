package ru.someerrors;

public class MultiCatch {

    public static void runMultiCash() {
        int a = 41, b = 0;
        int result;
        char chrs[] = {'А', 'В', 'C'};
        System.out.println();
        System.out.println(" === Блок Демо3. Повторное генерирование исключений");

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0)
                {
                    result = a / b;
                } else
                    chrs[5] = 'X';
            }
            // перехват обоих исключений,
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Перехват исключения: " + e);
            }
        }
        System.out.println("Цикл Демо3 обработки завершен.");
    }
}