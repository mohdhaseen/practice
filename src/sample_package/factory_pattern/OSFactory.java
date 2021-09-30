package sample_package.factory_pattern;

public class OSFactory {
    public static OS createOS(String type) {
        switch (type) {
            case "Android":
                return new Android();
            case "IOS":
                return new IOS();
            case "Windows":
                return new Windows();
        }
        return null;
    }
}
