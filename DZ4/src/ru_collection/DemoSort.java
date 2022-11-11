package ru_collection;

public class DemoSort {

   public  void Run(int cnt) {
       ArrayUtils  arrUt = new ArrayUtils(cnt);
       System.out.println("=== Сравнение встроенного метода сортировки с сортировкой Шелла по времени ("+cnt+" целых чисел) === ");
       System.out.println();
       arrUt.sortItByInternal(true);
       arrUt.sortItByInternal(false);
    }
    }
