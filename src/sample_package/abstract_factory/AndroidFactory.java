package sample_package.abstract_factory;

import sample_package.factory_pattern.Android;
import sample_package.factory_pattern.OS;

public class AndroidFactory implements AbstractOSFactory{
    @Override
    public OS createOS() {
        return new Android();
    }
}
