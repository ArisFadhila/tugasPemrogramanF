package LinkedList;

public class Flight {
        private class Passenger {
            String name;
            Passenger next;
            public Passenger(String name) {
                this.name = name;
                this.next = null;
            }
        }

        private Passenger head;
        public Flight() {
            this.head = null;
        }


        public void addPassenger(String name) {
            Passenger newPassenger = new Passenger(name);
            if (head == null) {
                head = newPassenger;
            } else {
                Passenger current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newPassenger;
            }
        }

        public void removePassenger(String name) {
            if (head == null) return;
            if (head.name.equals(name)) {
                head = head.next;
                return;
            }

            Passenger current = head;
            while (current.next != null) {
                if (current.next.name.equals(name)) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }

        public void displayPassengers() {
            Passenger current = head;
            if (current == null) {
                System.out.println("Tidak ada penumpang.");
                return;
            }
            while (current != null) {
                System.out.println(current.name);
                current = current.next;
            }
        }
        public static void main(String[] args) {
            Flight flight = new Flight();

            flight.addPassenger("City");
            flight.addPassenger("MU");
            flight.addPassenger("Madrid");

            System.out.println("Daftar Penumpang:");
            flight.displayPassengers();

            flight.removePassenger("MU");
            System.out.println("\nSetelah menghapus MU:");
            flight.displayPassengers();
        }
    }