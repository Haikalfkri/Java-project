import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        
        Album album = new Album("album1", "AC/DC");

        album.addSong("TNT", 4.5);
        album.addSong("Highway", 3.5);
        album.addSong("ThunderStruck", 5.0);
        albums.add(album);

        album = new Album("album2", "Beyonce");

        album.addSong("Run the World", 4.5);
        album.addSong("Halo", 3.4);
        album.addSong("Beautiful Liar", 3.3);

        albums.add(album);

        LinkedList<Song> playlist_1 = new LinkedList<>();

        albums.get(0).addToPlaylist("TNT", playlist_1);
        albums.get(0).addToPlaylist("Highway", playlist_1);
        albums.get(1).addToPlaylist("Run the World", playlist_1);
        albums.get(1).addToPlaylist("Beatufitul Liar", playlist_1);

        play(playlist_1);

    }

    private static ArrayList<Album> albums = new ArrayList<>();

    private static void play(LinkedList<Song> playList) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.isEmpty()) {
            System.out.println("This playlist have no song");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("no song available, reached to the end of the list");
                        forward = true;
                    }
                    break;
                
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("no song available, reached to the end of the list");
                        forward = false;
                    }
                    break;

                case 3:
                    if(!forward) {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("we are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("reached to the end of the list");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;
                
                case 5:
                    printMenu();
                    break;

                case 6:
                    if (!playList.isEmpty()) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("now playing " + listIterator.next().toString());
                        } else {
                            if (listIterator.hasPrevious()) {
                                System.out.println("now playing " + listIterator.previous().toString());
                            }
                        }
                    }
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available options \n press");
        System.out.println(
            "0 - to quit\n" +
            "1 - to play next song\n" +
            "2 - to play previous song\n" +
            "3 - to replay the current song\n" +
            "4 - list of all songs\n" + 
            "5 - print all available options\n" +
            "6 - delete current song"
        );
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("-------------------------");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------------------");
    }


}