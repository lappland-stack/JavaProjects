public class Song {
    private int id;
    private String title;
    private String artist;
    private int duration;   // seconds
    private String genre;

    /*
     * Constructors to initialise Song objects
     * @param id - unique song identifier
     * @param title - song title
     * @param artist - artist name
     * @param duration - duration in seconds
     * @param genre - song genre
     */
    public Song(int id, String title, String artist, int duration, String genre) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }
    //--------GETTERS--------//
    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int getDuration(){
        return duration;
    }

    public String getGenre(){
        return genre;
    }

    //--------SETTERS--------//
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist; 
    }

    public void setDuration(int durtion) {
        if (duration >= 0) { //basic validation
            this.duration = duration;
        }
    }
    

    //This method converts the seconds into a minute format. 
    private String formatDuration(int totalSeconds) {
        if (totalSeconds < 0) totalSeconds = 0;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return minutes + ":" + (seconds < 10 ? "0" : "") + seconds;
    }

    //This method converts the song object into a String. 
    @Override //this overrides an already existing "parent class" essnetially inheriting existing functionalities 
    public String toString() {
        return "ID: " + id
        + " | Title: " + title
        + " | Artist: " + artist
        + " | Duration: " + formatDuration(duration)
        + " | Genre: " + genre;
    }
}
