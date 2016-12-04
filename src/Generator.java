import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static java.lang.Thread.sleep;

/**
 * Created by sovarugby on 08.11.16.
 */
public class Generator extends Main implements Runnable  {

    public Generator(Set<Integer> set, int counter){
        this.set = set;
        this.counter = counter;
    }
    final Random random = new Random();

    public void run() {

        for (counter = 0; counter <99; counter++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (set) {
                System.out.println("гена взял ключь");
                set.add(random.nextInt(99));
            }
        }
    }

}
