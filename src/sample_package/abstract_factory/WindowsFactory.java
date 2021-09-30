package sample_package.abstract_factory;

import sample_package.factory_pattern.OS;
import sample_package.factory_pattern.Windows;

public class WindowsFactory implements AbstractOSFactory{
    @Override
    public OS createOS() {
        return new Windows();
    }
}
