package ru_next;

public class Test {
    private TestElement[] blocks;
    private int errCnt = 0;
    private int key = 0;

    public Test(TestElement[] blocks) {
        this.blocks = blocks;
    }

    public void runTest() {
        printHeader();

        for (int i = 0; blocks.length > i; i++) {
            key = blocks[i].ask(i);
            if (key == -1) {
                return;
            } else {
                errCnt = errCnt + key; //Если key = 1, то ответ был неправильный
            }
        }

        printResult(blocks.length, errCnt);
    }

    private void printHeader() {
        System.out.println();
        System.out.println(" *************************************************************************");
        System.out.println("  Ответьте на 4 загадки. Надо ввести НОМЕР правильного ответа.0 - прервать ");
        System.out.println(" *************************************************************************");
    };

    private void printResult(int total, int errcnt) {
        System.out.println(" *************************************************************************");
        System.out.println(" Ваши результаты - Правильных ответов:" + (total - errcnt) +", Неправильных:" + errcnt);
        System.out.println(" *************************************************************************");
    }

}


