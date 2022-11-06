package ru.question;

import ru_next.Test;
import ru_next.TestElement;

public class Main {

    public static void main(String[] args) {
   TestElement testEl1 = new TestElement("Два конца, два кольца,посредине гвоздик",new String[]{"Молоток", "Ножницы", "Циркуль"},2);
   TestElement testEl2 = new TestElement("Не огонь, а жжется",new String[]{"Крапива", "Солнце", "Водка"},1);
   TestElement testEl3 = new TestElement("Без рук, без топоренка, построена избенка",new String[]{"Дом", "Коробка", "Гнездо"},3);
   TestElement testEl4 = new TestElement("На колесах едет ловко, если тянешь за веревку", new String[]{"Колесо", "Корабль", "Самолет", "Машинка"},4);
   Test testMain = new Test(new TestElement[]{testEl1,testEl2,testEl3,testEl4});
   testMain.runTest();
    }
}