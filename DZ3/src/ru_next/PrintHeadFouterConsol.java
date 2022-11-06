package ru_next;

public class PrintHeadFouterConsol implements PrintHeadFooter {
    private final UserOutput userOutput = new ConsolUserOutput();
    public void printHeader() {
        userOutput.printMessage("");
        userOutput.printMessage(" *************************************************************************");
        userOutput.printMessage("  Ответьте на 4 загадки. Надо ввести НОМЕР правильного ответа.0 - прервать ");
        userOutput.printMessage(" *************************************************************************");
    }

    public void printResult(int total, int errcnt) {
        userOutput.printMessage(" *************************************************************************");
        userOutput.printMessage(" Ваши результаты - Правильных ответов:" + (total - errcnt) +", Неправильных:" + errcnt);
        userOutput.printMessage(" *************************************************************************");
    }
}
