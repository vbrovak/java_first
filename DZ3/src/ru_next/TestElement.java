package ru_next;

import java.util.Scanner;

public class TestElement {
 private String quest;
 private String[] answers;
 private int correct;

 public TestElement(String quest, String[] answers, int correct) {
  this.quest = quest;
  this.answers = answers;
  this.correct = correct;
 }

 public int ask(int index) {
  printQuestion(index);
  int k = getAnswerKey(answers.length);
   if (k == -1) {return(-1);}
   else
   {k = checkSimilar(k); }
   return (k);
  }

 private void printQuestion(int i) {
  System.out.println(" >> Вопрос N" + (i+1) + ": " + quest);
  //печать вариантов
  for (int j = 1; answers.length >= j; j++)
   System.out.println(j + "." + answers[j - 1]);
 };

  private int getAnswerKey(int total) {
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


 public int checkSimilar(int numKey) {
  if (numKey == this.correct) {
   System.out.println("Верно!");
   return(0);
  } else {
   System.out.println("Неверно ! Правильный ответ: " + (this.correct) + "." + answers[this.correct-1]);
   return(1);
  }
 }

}
