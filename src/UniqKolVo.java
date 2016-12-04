import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Thread.sleep;

/**
 * Created by sovarugby on 08.11.16.
 */
public class UniqKolVo extends Main implements Runnable{
    public UniqKolVo(Set<Integer> set, int counter){
        this.set = set;
        this.counter = counter;
    }


    public void run() {

        while (true) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (set) {
                    System.out.println("кол-во уникальных чисел ="+ set.size());

            }
        if(counter == 99) break;
        }
    }

}
