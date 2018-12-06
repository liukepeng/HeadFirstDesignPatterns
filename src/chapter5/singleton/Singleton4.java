package chapter5.singleton;

/**
 * 双重校验锁
 * JDK1.5起有效
 * 安全且在多线程情况下能保持高性能。
 */
public class Singleton4 {
    private static volatile Singleton4 instance ;
    private Singleton4(){}

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
