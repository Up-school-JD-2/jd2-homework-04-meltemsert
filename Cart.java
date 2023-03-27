import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Song> songs;

    public Cart() {

        songs = new ArrayList<>();
    }

    public void addMusicCart(Song song) {

        this.songs.add(song);
    }

    public void removeMusicCart(Song song) {

        this.songs.remove(song);
    }

    public void listSongs() {
        System.out.println("*********Selected Songs**************");
        for (Song song : songs) {
            System.out.println(song.getName());
        }
        System.out.println();
        System.out.println("All of the songs total price is: " + totalPrice());
    }

    public double totalPrice() {
        double total = 0;
        for (Song song : songs) {
            total += song.getPrice();
        }

        return total;
    }


}
