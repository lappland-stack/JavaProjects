public class PlaylistManager {
    private static final int MAX_SONGS = 10;

    // Must not change: fixed-size array storage
    private Song[] playlist = new Song[MAX_SONGS];
    private int count = 0;

    public String addSong(Song song) {
        //Check if playlist is full
        if (count >= MAX_SONGS) {
            return "Playlist is full. Cannot add more songs.";
        }
        //Check for null song (extra safety for added redundancy)
        if (song == null) {
            return "Invalid song.";
        }
        /*Check for duplicate ID (again more redundancy)
         * This helps avoid adding the same song or having a song with the 
         * same unique id in the playlist
         */
        for (int i = 0; i < count; i++) {
            if (playlist[i].getId() == song.getId()) {
                return "Error: A song with ID " + song.getId() + " already exists";
            }
        }
        //Add song to the next available position
        playlist[count] = song;
        count++;
        return "Song added:\n" + song; //song is the song added to the playlist. 
    }

    public String deleteSongById(int id) {
        //Check if playlist is empty, as there would be nothing to delete
        if (count == 0) {
            return "Playlist is empty. Nothing to delete. ";
        }

        int index = -1;

        //Find song index
        for (int i = 0; i < count; i++) {
            if (playlist[i].getId() == id) {
                index = i;
                break;
            }
        }
        //If not found
        if (index == -1) {
            return "No song found with ID " + id + ".";
        }
        //Store removed song for output 
        Song removed = playlist[index];
        //Shift elements left
        for (int i = index; i < count -1; i++) {
            playlist[i] = playlist[i + 1];
        }
        //Clear last slot
        playlist[count - 1] = null;
        count--;

        return "Deleted:\n" + removed;  //removed is the song deleted.  
    }

    public String searchSongByTitle(String title) {
        //Check if the title is null
        if (title == null || title.trim().isEmpty()) {
            return "Please enter a vild title.";
        }
        String target = title.trim();

        //Search for first matching song (case-insensitive)
        for (int i = 0; i < count; i++) {
            if (playlist[i].getTitle().equalsIgnoreCase(target)) {
                return "Song found:\n" + playlist[i];
            }
        }

        //Check if the title is not found in the playlist

        return "No song found with title \"" + target + "\"."; //
    }

    // Sorting feature: alphabetical by title ascending (A -> Z)
    // No built-in sorting allowed - oh cmon (╯°□°)╯︵ ┻━┻ (thats a unicode "flipping table" emoji
    public String sortSongs() {
        //If playlist is eampty or has 1 song, no need to sort
        if (count <= 1) {
            return "Playlist already sorted.\n\n" + listAllSongs();
        }
        
        //Bubble Sort (ascending by title)
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++){
                String title1 = playlist[j].getTitle();
                String title2 = playlist[j + 1].getTitle();
                
                //Compare titles ignoring case
                if (title1.compareToIgnoreCase(title2) > 0) {
                    //Swap songs
                    Song temp = playlist[j];
                    playlist[j] = playlist[j +1];
                    playlist[j + 1] = temp;
                }
            }
        }

        return "Playlist sorted by title.\n\n" + listAllSongs();
    }

    public String listAllSongs() {
        if (count == 0) {
            return "Playlist is empty.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Playlist (").append(count).append(" song").append(count == 1 ? "" : "s").append("):\n\n");
        for (int i = 0; i < count; i++) {
            sb.append(i + 1).append(". ").append(playlist[i]).append("\n");
        }
        return sb.toString();
    }

    // ---------- Helper methods ----- //
    //You can add any helper methods, if needed. 

}
