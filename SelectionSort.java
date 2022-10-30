import java.util.ArrayList;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(5);
        array.add(3);
        array.add(8);
        array.add(1);
        array.add(2);

        System.out.println("Перед сортировкой: " + array);
        MakeSelectionSort(array);
        System.out.println("После сортировки: " + array);
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
