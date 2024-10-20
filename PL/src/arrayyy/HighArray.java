package arrayyy;

public class HighArray {
        private double[] arr;
        private int nElems;

        public HighArray(int max) {
            arr = new double[max];
            nElems = 0;
        }

        public boolean find(double searchKey) {
            int j;
            for (j = 0; j < nElems; j++)
                if (arr[j] == searchKey)
                    break;
            if (j == nElems)
                return false;
             else
                return true;
            }

        public void insert(double value) {
            arr[nElems] = value;
            nElems++;
        }

        public boolean delete(double value) {
            int j;
            for (j = 0; j < nElems; j++)
                if (value == arr[j])
                    break;
            if (j == nElems)
                return false;
            else {
                for (int k = j; k < nElems; k++)
                    arr[k] = arr[k + 1];
                nElems--;
                return true;
            }
        }

        public void display() {
            for (int j = 0; j < nElems; j++)
                System.out.print(arr[j] + " ");
            System.out.println();
        }

        public void deleteAndDisplay(double... values) {
            int found = 0;
            System.out.print("Ditemukan ");
            for (double value : values) {
                if (delete(value)) {
                    found++;
                    System.out.print(value + " ");
                }
            }
            System.out.println();
            System.out.print("Delete : ");
            for (double value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
            display();
        }
    }


