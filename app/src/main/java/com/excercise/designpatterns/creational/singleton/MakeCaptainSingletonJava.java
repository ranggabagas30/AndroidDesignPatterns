package com.excercise.designpatterns.creational.singleton;

public class MakeCaptainSingletonJava {

    //private static MakeCaptainSingletonJava _captain;

    // using eager initialization
    private static MakeCaptainSingletonJava _captain = new MakeCaptainSingletonJava();

    private MakeCaptainSingletonJava() {} // prevent instantiating object not using getInstance()

    public MakeCaptainSingletonJava getInstance() {
        if (_captain == null) {
            _captain = new MakeCaptainSingletonJava();
        }
        return _captain;
    }

    // using synchronized keyword
    // but we need to pay for the performance cost
    public static synchronized MakeCaptainSingletonJava getInstanceSync() {
        if (_captain == null) {
            _captain = new MakeCaptainSingletonJava();
        }
        return _captain;
    }

    public static MakeCaptainSingletonJava getInstanceEagerInitialization() {
        return _captain;
    }

    // Bill pugh solution
    // This method does not need to use the synchronization technique and eager initialization. It is regarded
    // as the standard method to implement singletons in Java.
    private static class SingletonHelper {
        private static final MakeCaptainSingletonJava _captain = new MakeCaptainSingletonJava();
    }

    public static MakeCaptainSingletonJava getInstanceBySingletonHelper() {
        return SingletonHelper._captain;
    }
}
