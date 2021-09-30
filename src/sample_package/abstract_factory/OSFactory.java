package sample_package.abstract_factory;

import sample_package.factory_pattern.Android;
import sample_package.factory_pattern.IOS;
import sample_package.factory_pattern.OS;
import sample_package.factory_pattern.Windows;

public class OSFactory {
    public static OS createOS(AbstractOSFactory abstractOSFactory) {
        return abstractOSFactory.createOS();
    }
}
