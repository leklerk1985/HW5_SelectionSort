import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0; i<10000; i++) {
            array.add(rand.nextInt());
        }

        ArrayList<Integer> arrayCopy = new ArrayList<>();
        arrayCopy.addAll(array);

        long startTime = System.currentTimeMillis();
        MakeSelectionSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения MakeSelectionSort(): " + (endTime - startTime) + "миллисекунд.");

        long startTime1 = System.currentTimeMillis();
        Collections.sort(arrayCopy);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время выполнения Collections.sort(): " + (endTime1 - startTime1) + "миллисекунд.");
    }

    public static void MakeSelectionSort(ArrayList<Integer> array) {
        int N = array.size();
        for (int i=0; i<N-1; i++) {
            int nMin = i;
            int min = array.get(i);

            for (int j=i+1; j<N; j++) {
                if (array.get(j)<min) {
                    min = array.get(j);
                    nMin = j;
                }
            }

            array.set(nMin, array.get(i));
            array.set(i, min);
        }
    }
}
