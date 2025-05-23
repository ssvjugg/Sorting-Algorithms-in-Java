import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

public class MainTest {
    int[] arr;

    @BeforeEach
    public void randomArray() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = ThreadLocalRandom.current().nextInt(20);
    }

    @Test
    public void testBubbleSort() {
        Main.bubbleSort(arr);
    }

    @Test
    public void testSelectionSort() {
        Main.selectionSort(arr);
    }
}
