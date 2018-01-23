package C4010210;

public class Song {

    String title;
    String artist;
    String album;
    String[] composer;
    String year;

    int track;

    public Song(){ }

    public Song(String title, String artist, String album, int track, String[] composer, String year){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.composer = composer;
        this.year = year;
        this.track = track;
    }

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public void show(){
        System.out.println("아티스트 : " + this.artist);
        System.out.println("곡명 : " + this.title);
    }

    public void Allshow(){
        System.out.println("아티스트 : " + this.artist);
        System.out.println("곡명 : " + this.title);
        System.out.println("엘범 : " + this.album);
        System.out.println("트랙: " + this.track + "번");
        System.out.print("작곡가 : ");
        for(int i = 0; i < this.composer.length-1; i++) System.out.print(this.composer[i] + ", ");
        System.out.println(this.composer[composer.length-1]);
        System.out.println("년도 : " + this.year);
    }
}
