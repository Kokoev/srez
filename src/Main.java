import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static javafx.scene.input.KeyCode.F;

/**
 * Created by sovarugby on 08.11.16.
 */
public class Main {
        public static int counter = 0;
        static Set<Integer> set = new HashSet<Integer>();

        public static void main(String[] args) {
            Thread g = new Thread(new Generator(set, counter));
            Thread u = new Thread(new UniqKolVo(set, counter));
            g.start();
            u.start();

        }
}

