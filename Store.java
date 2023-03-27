import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Album> albums;

    public Store() {
        albums = new ArrayList<>();
    }

    public List<Album> getAlbums() {

        return albums;
    }

    public void setAlbums(List<Album> albums) {

        this.albums = albums;
    }

    public void addMusicCart(Album album) {

        this.albums.add(album);
    }

    public void searchForAlbum(Album album) {
        for (Album album1 : albums) {
            if (album1.getName().equalsIgnoreCase(album.getName())) {
                System.out.println("Album name found: " + album.getName());
                System.out.println();
                return;
            }

        }
        System.out.println("Album not found");
        System.out.println();


    }

}








