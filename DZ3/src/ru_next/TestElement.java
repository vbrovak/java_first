package ru_next;

import java.util.Scanner;

public class TestElement {
 private String quest;
 private String[] answers;
 private int correct;
 private UserInput userInput = new ConsolUserInput();
 private UserOutput userOutput = new ConsolUserOutput();


 public TestElement(String quest, String[] answers, int correct) {
  this.quest = quest;
  this.answers = answers;
  this.correct = correct;
 }

 public int ask(int index) {
  printQuestion(index);
  int k =  userInput.read(answers.length);
   if (k == -1) {return(-1);}
   else
   {k = checkSimilar(k); }
   return (k);
  }

 private void printQuestion(int i) {
  userOutput.printMessage(" >> Вопрос N" + (i+1) + ": " + quest);
  //печать вариантов
  for (int j = 1; answers.length >= j; j++)
   userOutput.printMessage(j + "." + answers[j - 1]);
 };

 private int checkSimilar(int numKey) {
  if (numKey == this.correct) {
   userOutput.printMessage("Верно!");
   return(0);
  } else {
   userOutput.printMessage("Неверно ! Правильный ответ: " + (this.correct) + "." + answers[this.correct-1]);
   return(1);
  }
 }

}
