package singleton;

class Singleton {
    private static volatile Singleton singleton;
    private static volatile int instancesCount;

    private Singleton() {
        ++instancesCount;
    }

    static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }

    static int getInstancesCount() {
        return instancesCount;
    }
}
