
public class Song {
    private String name;
    private String singerName;
    private Album album;
    private String duration;

    private double price;

    public Song(String name, String singerName, Album album, String duration, double price) {
        this.name = name;
        this.singerName = singerName;
        this.album = album;
        this.duration = duration;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name=" + name +
                '}';
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

    public Album getAlbum() {

        return album;
    }

    public void setAlbum(Album album) {

        this.album = album;
    }

    public String getDuration() {

        return duration;
    }

    public void setDuration(String duration) {

        this.duration = duration;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void printSongInfo() {
        System.out.println("*************SongInfo**************");
        System.out.println("The name of the song : " + name);
        System.out.println("The name of the singer: " + singerName);
        System.out.println("Album name is: " + album.getName());
        System.out.println("The duration of the song: " + duration);
        System.out.println("Price of the song: " + price);
        System.out.println();
    }
}
