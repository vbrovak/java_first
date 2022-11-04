package ru_next;

public class PrintHeadFouterConsol implements PrintHeadFooter {
    public void printHeader() {
        System.out.println();
        System.out.println(" *************************************************************************");
        System.out.println("  Ответьте на 4 загадки. Надо ввести НОМЕР правильного ответа.0 - прервать ");
        System.out.println(" *************************************************************************");
    }

    public void printResult(int total, int errcnt) {
        System.out.println(" *************************************************************************");
        System.out.println(" Ваши результаты - Правильных ответов:" + (total - errcnt) +", Неправильных:" + errcnt);
        System.out.println(" *************************************************************************");
    }
}
