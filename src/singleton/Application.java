package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Application {
    public static void main(String... args) throws InterruptedException {
        int numberOfThreads = 2;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        IntStream.range(0, numberOfThreads).forEach(i ->
                executorService.execute(() -> {
                    Singleton.getInstance();
                    System.out.println(Singleton.getInstancesCount());
                }));
        executorService.awaitTermination(3, SECONDS);
    }
}
