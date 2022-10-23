package ru.question;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final int ERROR_INPUT_INT = -1000000;
    public static void main(String[] args) {

        int errcnt = 0; // количество ошибочных

        //можно было бы сразу из 2х одинарных ниже сделать двумерный массив, но для учебного задания нагляднее так
        //массив вопросов
        String[] questions = {"Два конца, два кольца,посредине гвоздик",
                "Не огонь, а жжется",
                "Без рук, без топоренка, построена избенка",
                "На колесах едет ловко, если тянешь за веревку"};
        //массив номеров правильных ответов
        int[] corrects = {2, 1, 3, 1, 4};

        //двухмерный массив ответов
        String[][] answers = {
                {"Молоток", "Ножницы", "Циркуль"},
                {"Крапива", "Солнце", "Водка"},
                {"Дом", "Коробка", "Гнездо"},
                {"Колесо", "Корабль", "Самолет", "Машинка"}
        };


        //печать заголовка
        System.out.println(" *************************************************************************");
        System.out.println("  Ответьте на 4 загадки. Надо ввести НОМЕР правильного ответа.0 - прервать ");
        System.out.println(" *************************************************************************");

        // == цикл по вопросам ==
        for (int i = 1; questions.length >= i; i++) {
            System.out.println("Вопрос N" + i + ": " + questions[i - 1]);
            //печать вариантов
            for (int j = 1; answers[i-1].length >= j; j++) {
                System.out.println(j + "." + answers[i - 1][j - 1]);
            }
            int a = ERROR_INPUT_INT;
            do {
                System.out.println("Введите ответ (1 - " + answers[i-1].length + "), 0 - прервать задачу");
                Scanner sc = new Scanner(System.in);
                if (sc.hasNextInt()) {
                    a = sc.nextInt();
                    if (a == 0) {
                        System.out.println(" >> Работа программы прервана пользователем");
                        return;
                    }
                    if (a < 0 || a > answers[i-1].length) {
                        a = ERROR_INPUT_INT;
                    }
                    }
                else {
                    a = ERROR_INPUT_INT;
                }
            }
                    while (a == ERROR_INPUT_INT) ;

        if (a == corrects[i - 1]) {
            System.out.println("Верно!");
        } else {
            // Про corrects[i-1]-1 Два раза -1 потому, что индексы массивов с 0 начинаются.
            System.out.println("Неверно ! Правильный ответ: " + (corrects[i - 1]) + "." + answers[i - 1][corrects[i - 1] - 1]);
            errcnt++;
        } //конец обработки условного оператора
        System.out.println();
    }
        System.out.println(" *************************************************************************");
        System.out.println(" Ваши результаты - Правильных ответов:"+(questions.length-errcnt)+", Неправильных:"+errcnt);
        System.out.println(" *************************************************************************");

}
}
