package sample_package.abstract_factory;

import sample_package.factory_pattern.IOS;
import sample_package.factory_pattern.OS;

public class IOSFactory implements AbstractOSFactory{
    @Override
    public OS createOS() {
        return new IOS();
    }
}
