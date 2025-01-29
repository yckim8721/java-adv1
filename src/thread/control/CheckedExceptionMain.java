package thread.control;

public class CheckedExceptionMain {

    public static void main(String[] args) {

    }

    static class CheckRunnable implements Runnable {

        @Override
        public void run() /*throws Exception*/ { // 주석 풀면 예외 발생
            // throw new Exception(); // 주석 풀면 예외 발생
        }
    }
}
