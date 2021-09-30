package sample_package.abstract_factory;

import sample_package.factory_pattern.OS;

public class MainClass {
    public static void main(String[] args) {
        OS android = OSFactory.createOS(new AndroidFactory());
    }
}
