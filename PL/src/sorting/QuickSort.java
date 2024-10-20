package sorting;

public class QuickSort {

    // Method untuk mengatur array
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            // Menentukan posisi pivot setelah partition
            int pivotIndex = partition(array, start, end);

            // Rekursi untuk sub-array kiri dan kanan pivot
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    // Method untuk melakukan partitioning
    private static int partition(int[] array, int start, int end) {
        // Memilih pivot sebagai elemen terakhir
        int pivot = array[end];
        int i = start - 1; // Index dari elemen yang lebih kecil

        for (int j = start; j < end; j++) {
            // Jika elemen saat ini lebih kecil atau sama dengan pivot
            if (array[j] <= pivot) {
                i++;

                // Menukar elemen array[i] dan array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Menukar elemen array[i+1] dengan pivot (array[end])
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 4, 9, 5};
        System.out.println("Array sebelum diurutkan:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Array setelah diurutkan:");
        printArray(array);
    }

    // Method untuk mencetak array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

