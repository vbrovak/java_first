package ru_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class ArrayUtils {
    private int arrayCnt;
    private ExtSorter extSorter = new ExtSorter();
    private ArrayList<Integer> arList1 = new ArrayList();
    private ArrayList<Integer> arList2 = new ArrayList();

    public ArrayUtils(int arrayCnt) {
        this.arrayCnt = arrayCnt;
        fillCollection();
        this.arList2.addAll(arList1);
    }

    public void sortItByInternal(boolean byInternal) {
        String methodName = "";
        long currdateTime = 0;
        if (byInternal == true) {
            methodName = "внутренним методом (quickSort - метод Хоара)";
            currdateTime = System.nanoTime();
            Collections.sort(arList1);
        } else {
            methodName = "методом Шелла";
            Integer[] indData = arList2.toArray(new Integer[0]);
            currdateTime = System.nanoTime();
            extSorter.sort(indData);
        }
        System.out.println("  >> Время сортировки " + methodName + ": " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - currdateTime) + " миллиcекунд");
    }

    private void fillCollection() {
        for (int i = 0; i < arrayCnt; i++) {
            arList1.add(rnd(0, arrayCnt));
        }
    }

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


}
