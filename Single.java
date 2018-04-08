package template;

public class Single {

    private static volatile Single mInstance;

    private Single() {

    }

    public static Single getInstance() {
        if (mInstance == null) {
            synchronized (Single.class) {
                if (mInstance == null) {
                    mInstance = new Single();
                }
            }
        }
        return mInstance;
    }

}
