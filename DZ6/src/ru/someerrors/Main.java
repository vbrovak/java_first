package ru.someerrors;

public class Main {
    public static void main(String[] args) throws Throwable {
        DemoCatcher demoCatcher = new DemoCatcher();
        demoCatcher.run();
        MultiCatch multiCatch = new MultiCatch();
        multiCatch.runMultiCash();
        RethrowException rethrowException = new RethrowException();
        rethrowException.runRethrowDemo();
        CopyFile copyFile = new CopyFile();
        copyFile.copyfile();
    }
}
