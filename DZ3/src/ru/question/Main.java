package ru.question;

import ru_next.Test;
import ru_next.TestElement;

import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
//        int key;
//        int errcnt = 0;
//        PrintMessages prMess = new PrintMessages();
//        QuestOperations prQuest = new QuestOperations();
//        AskMessages prAskMess = new AskMessages();
//
//        prMess.printHeader();
//        for (int i = 1; prQuest.questions.length >= i; i++) {
//            prQuest.printQuestion(i);
//            key = prAskMess.getAnswerKey(prQuest.answers[i-1].length);
//            if (key == -1)
//            {System.out.println(" >> Работа программы прервана пользователем");
//                return;}
//            else {errcnt = errcnt + prQuest.checkSimilar(i,key);}
//            System.out.println();
//        };
//        prMess.printResult(prQuest.questions.length,errcnt);

   TestElement testEl1 = new TestElement("Два конца, два кольца,посредине гвоздик",new String[]{"Молоток", "Ножницы", "Циркуль"},2);
   TestElement testEl2 = new TestElement("Не огонь, а жжется",new String[]{"Крапива", "Солнце", "Водка"},1);
   TestElement testEl3 = new TestElement("Без рук, без топоренка, построена избенка",new String[]{"Дом", "Коробка", "Гнездо"},3);
   TestElement testEl4 = new TestElement("На колесах едет ловко, если тянешь за веревку", new String[]{"Колесо", "Корабль", "Самолет", "Машинка"},4);
   Test testMain = new Test(new TestElement[]{testEl1,testEl2,testEl3,testEl4});
   testMain.runTest();
    }
}
//    class QuestOperations {
//        private int j;
//        String[] questions = {"Два конца, два кольца,посредине гвоздик",
//                "Не огонь, а жжется",
//                "Без рук, без топоренка, построена избенка",
//                "На колесах едет ловко, если тянешь за веревку"};
//
//        String[][] answers = {
//                {"Молоток", "Ножницы", "Циркуль"},
//                {"Крапива", "Солнце", "Водка"},
//                {"Дом", "Коробка", "Гнездо"},
//                {"Колесо", "Корабль", "Самолет", "Машинка"}
//        };
//        //массив номеров правильных ответов
//        int[] corrects = {2, 1, 3, 4};
//
//        public void printQuestion(int i) {
//            System.out.println("Вопрос N" + i + ": " + questions[i - 1]);
//            //печать вариантов
//            for (int j = 1; answers[i - 1].length >= j; j++) {
//                System.out.println(j + "." + answers[i - 1][j - 1]);
//            }
//        };
//
//        public int checkSimilar(int row, int numKey) {
//            if (numKey == corrects[row - 1]) {
//                System.out.println("Верно!");
//                return(0);
//            } else {
//                // Про corrects[i-1]-1 Два раза -1 потому, что индексы массивов с 0 начинаются.
//                System.out.println("Неверно ! Правильный ответ: " + (corrects[row - 1]) + "." + answers[row - 1][corrects[row - 1] - 1]);
//                return(1);
//            }
//        }
//    };
//
//// Ввод варианта ответа
//class AskMessages {
//    private static final int ERROR_INPUT_INT = -1000000;
//    private int a;
//    public int getAnswerKey(int total) {
//        int a = ERROR_INPUT_INT;
//        do {
//            System.out.println("Введите ответ (1 - " + total + "), 0 - прервать задачу");
//            Scanner sc = new Scanner(System.in);
//            if (sc.hasNextInt()) {
//                a = sc.nextInt();
//                if (a == 0) {
//                    return(-1);
//                }
//                if (a < 0 || a > total) {
//                    a = ERROR_INPUT_INT;
//                }
//            } else {
//                a = ERROR_INPUT_INT;
//            }
//        }
//        while (a == ERROR_INPUT_INT);
//        return (a);
//    }
//}
//
//class PrintMessages {
//    private String id;
//    public void printHeader() {
//        System.out.println();
//        System.out.println(" *************************************************************************");
//        System.out.println("  Ответьте на 4 загадки. Надо ввести НОМЕР правильного ответа.0 - прервать ");
//        System.out.println(" *************************************************************************");
//    };
//    public void printResult(int total, int errcnt) {
//        System.out.println(" *************************************************************************");
//        System.out.println(" Ваши результаты - Правильных ответов:"+(total-errcnt)+", Неправильных:"+errcnt);
//        System.out.println(" *************************************************************************");
//    }


