package LinkedList;

public class Playlist {

    private class Song {
        private String title;
        private Song next;
        public Song(String title) {
            this.title = title;
            this.next = null;
        }
        public String getTitle() {
            return title;
        }
        public Song getNext() {
            return next;
        }
        public void setNext(Song next) {
            this.next = next;
        }
    }
    private Song head;

    public Playlist() {
        this.head = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newSong);
        }
    }
    public void displayPlaylist() {
        Song current = head;
        while (current != null) {
            System.out.println(current.getTitle());
            current = current.getNext();
        }
    }
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Balonku Ada 5");
        playlist.addSong("Celengan Rindu");
        playlist.addSong("Jendela Kelas Satu");

        System.out.println("Playlist:");
        playlist.displayPlaylist();
    }
}

