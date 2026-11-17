class Config {
    private static String appName = "My Java App";
    private static int callCount = 0;

    private Config() {
    }

    public static void showConfig() {
        callCount++;

        System.out.println("Application: " + appName);
        System.out.println("Method Calls: " + callCount);
    }

    public static void changeName(String name) {
        appName = name;
        callCount++;
    }

    public static int getCallCount() {
        return callCount;
    }
}

public class ConfigManager {
    public static void main(String[] args) {

        Config.showConfig();

        Config.changeName("Student Management System");

        Config.showConfig();

        System.out.println("Total Calls: " +
                           Config.getCallCount());
    }
}