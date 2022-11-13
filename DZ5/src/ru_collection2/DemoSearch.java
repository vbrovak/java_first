package ru_collection2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


public class DemoSearch {
 private   TreeMap<Person, Integer> map;
 private   TreeMap<Accounts, Integer> map2;

    public void Run() {
        System.out.println("=== Демонстрация поиска  === ");

        System.out.println("1. Поиск клиентов 18 лет и старше ");
        Person firstAdultPerson = map.navigableKeySet().stream().filter(person -> person.age > 18).findFirst().get();
        Map<Person, Integer> adultPeopleMap = map.tailMap(firstAdultPerson, true);
        for (Map.Entry temp : adultPeopleMap.entrySet()) {
            System.out.println(((Person) temp.getKey()).fio);
        }

        System.out.println("2. Поиск счетов, относящихся к клиенту (Сидоров)");
        for (Map.Entry temp : map2.entrySet())
            if (((Accounts) temp.getKey()).fio == "Сидоров") System.out.println(((Accounts) temp.getKey()).acc);

        System.out.println("3. Поиск клиента по счету 4444");
        Accounts firstAccount = map2.navigableKeySet().stream().filter(accounts -> accounts.acc == 4444).findFirst().get();
        System.out.println("Фамилия клиента по номеру счета : "+firstAccount.fio);
    }

    public DemoSearch() {
        map = new TreeMap<>(Comparator.comparingInt(o -> o.age));
        map2 = new TreeMap<>(Comparator.comparingInt(o -> o.acc));

        map.put(new Person("Иванов", 19), 0);
        map.put(new Person("Петров", 14), 1);
        map.put(new Person("Сидоров", 32), 2);
        map.put(new Person("Кузнецов", 16), 3);

        map2.put(new Accounts("Иванов", 1111), 0);
        map2.put(new Accounts("Иванов", 1112), 1);
        map2.put(new Accounts("Петров", 2222), 2);
        map2.put(new Accounts("Сидоров", 3333), 3);
        map2.put(new Accounts("Сидоров", 3335), 4);
        map2.put(new Accounts("Сидоров", 3337), 5);
        map2.put(new Accounts("Кузнецов", 4444), 6);
    }

}
