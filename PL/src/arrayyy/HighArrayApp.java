package arrayyy;

public class HighArrayApp{
        public static void main(String[] args) {
            int maxSize = 10;
            HighArray arr;
            arr = new HighArray(maxSize);

            arr.insert(77);
            arr.insert(99);
            arr.insert(44);
            arr.insert(55);
            arr.insert(22);
            arr.insert(88);
            arr.insert(11);
            arr.insert(00);
            arr.insert(66);
            arr.insert(33);

            arr.display();

            arr.deleteAndDisplay(0, 55, 99);
        }
    }


