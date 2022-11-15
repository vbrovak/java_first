package ru_collection2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


public class DemoSearch {
    private TreeMap<Person, Integer> map;
    private TreeMap<String, PersonExt> map1;
    private TreeMap<Integer, Accounts> map2;

    private String aFio = "Сидоров";
    private int aAcc = 4444;
    private PersonExt pe;
    private Accounts ac;

    public void Run() {
        System.out.println("=== Демонстрация поиска  === ");

        System.out.println("1. Поиск счетов, относящихся к клиенту (Сидоров)");
        pe = map1.get(aFio);
        System.out.println(pe.myAccList);

        System.out.println("2. Поиск клиента по счету 4444");
        ac = map2.get(aAcc);
        System.out.println(ac.fio);
    }


    public DemoSearch() {
        map = new TreeMap<>(Comparator.comparingInt(o -> o.age));
        map1 = new TreeMap<>(Comparator.naturalOrder());
        map2 = new TreeMap<>(Comparator.naturalOrder());

        map.put(new Person("Иванов", 19), 0);
        map.put(new Person("Петров", 14), 1);
        map.put(new Person("Сидоров", 32), 2);
        map.put(new Person("Кузнецов", 16), 3);

        map1.put("Иванов", new PersonExt("Иванов", 19, "0000,1111,2222"));
        map1.put("Петров", new PersonExt("Петров", 23, "3333,4444,5555"));
        map1.put("Сидоров", new PersonExt("Сидоров", 47, "7777,8888,9999"));

        map2.put(1111, new Accounts("Иванов", 1111));
        map2.put(1112, new Accounts("Иванов", 1112));
        map2.put(2222, new Accounts("Петров", 2222));
        map2.put(3333, new Accounts("Сидоров", 3333));
        map2.put(3335, new Accounts("Сидоров", 3335));
        map2.put(3337, new Accounts("Сидоров", 3337));
        map2.put(4444, new Accounts("Кузнецов", 4444));
    }

}
