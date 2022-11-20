package ru.someerrors;

public class RethrowException {

    public static void runRethrowDemo() throws Throwable {
        System.out.println();
        System.out.println(" === Блок Демо4. Прокидывание исключений");

        try {
            test2();
        } catch(Exception e) {
            System.out.println("Перехвачено в главном из test2");
        }
    }

    public static void test1() throws Exception {
        System.out.println("Исключение в test1");
        throw new Exception("прокидываем дальше");
    }
    public static void test2() throws Throwable {
        try {
            test1();
        } catch(Exception e) {
            System.out.println("Исключение в test2, перехвачено из test1");
            throw e;
        }
    }

}
