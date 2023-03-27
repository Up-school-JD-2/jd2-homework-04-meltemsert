import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Song> songs = new ArrayList<>();
        List<Song> songs1 = new ArrayList<>();
        List<Album> albums= new ArrayList<>();

        Album album = new Album("Ben Bazen", "Simge", "2019", songs);
        Album album2 = new Album("Maya", "Mabel Matiz", "2018",songs1);

        albums.add(album);
        albums.add(album2);

        Song song = new Song("Aşkın Olayım", "Simge", album, "3:56", 50.0);
        Song song2 = new Song("Üzülmedin mi?", "Simge", album, "4:43", 55.20);
        Song song3 = new Song("Öyle Kolaysa", "Mabel Matiz", album2, "4:40", 65.35);
        Song song4 = new Song("Mendilimde Kırmızı Var", "Mabel Matiz", album2, "6:04", 85.45);

        songs.add(song);
        songs.add(song2);
        songs1.add(song3);
        songs1.add(song4);

        User user=new User("Meltem","Sert","meltemsert57@gmail.com");
        User user2=new User("Emine","Çamlıcalı","eminecamlicali@gmail.com");

        user.printUserInfo();
        user2.printUserInfo();

        album.printAlbumInfo();
        album2.printAlbumInfo();

        song.printSongInfo();
        song2.printSongInfo();
        song3.printSongInfo();
        song4.printSongInfo();


        Store store=new Store();
        store.setAlbums(albums);
        store.searchForAlbum(album2);


        Cart cart =new Cart();
        cart.addMusicCart(song);
        cart.addMusicCart(song4);

        cart.listSongs();




    }
}