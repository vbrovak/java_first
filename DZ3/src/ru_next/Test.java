package ru_next;

public class Test {
    private final TestElement[] blocks;
    public int errCnt = 0;

    private PrintHeadFooter prHeadFooter =  new PrintHeadFouterConsol();
    public Test(TestElement[] blocks) {
        this.blocks = blocks;
    }
    public void runTest() {
        prHeadFooter.printHeader();
        for (int i = 0; blocks.length > i; i++) {
            int key = blocks[i].ask(i);
            if (key == -1) {
                return;
            } else {
                errCnt = errCnt + key; //Если key = 1, то ответ был неправильный
            }
        }
        prHeadFooter.printResult(blocks.length, errCnt);
    }
}