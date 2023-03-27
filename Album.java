import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String singerName;
    private String releaseDate;

    private List<Song> songs;


    public Album(String name, String singerName, String releaseDate, List<Song> songs) {
        this.name = name;
        this.singerName = singerName;
        this.releaseDate = releaseDate;
        this.songs = songs;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSingerName() {

        return singerName;
    }

    public void setSingerName(String singerName) {

        this.singerName = singerName;
    }

    public String getReleaseDate() {

        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {

        this.releaseDate = releaseDate;
    }

    public List<Song> getSongs() {

        return songs;
    }

    public void setSongs(List<Song> songs) {

        this.songs = songs;
    }

    public void printAlbumInfo() {
        System.out.println("***********AlbumInfo**************");
        System.out.println("The name of the albüm: " + name);
        System.out.println("The name of the singer: " + singerName);
        System.out.println("The album release date is: " + releaseDate);
        System.out.println("Songs from the album: " + songs);
        System.out.println();


    }


}
