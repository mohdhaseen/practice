package sample_package.factory_pattern;

public class MainClass {
    public static void main(String[] args) {
        OS android = OSFactory.createOS("Android");
    }
}
