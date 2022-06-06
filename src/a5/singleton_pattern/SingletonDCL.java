package a5.singleton_pattern;

public class SingletonDCL {
    private static volatile SingletonDCL uniqueInstance;

    private SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDCL.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDCL();
                }
            }

        }
        return uniqueInstance;
    }
}
