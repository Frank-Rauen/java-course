package com.company;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Phanerozoic II: Mesozoic | Cenozoic", "The Ocean Collective");
        album.addSong("Triassic", 8.32);
        album.addSong("Jurassic | Cretaceous", 13.24);
        album.addSong("Paleocene", 4.00);
        album.addSong("Eocene", 3.57);
        album.addSong("Oligocene", 4.00);
        album.addSong("Miocene | Pliocene", 4.40);
        album.addSong("Pleistocene", 6.40);
        album.addSong("Holocene", 5.47);
        albums.add(album);

        album = new Album("Blackwater Park", "Opeth");
        album.addSong("The Leper Affinity", 10.23);
        album.addSong("Bleak", 9.15);
        album.addSong("Harvest", 6.01);
        album.addSong("The Drapery Falls", 10.53);
        album.addSong("Dirge For November", 7.53);
        album.addSong("The Funeral Portrait", 8.44);
        album.addSong("Patterns in the Ivy", 1.52);
        album.addSong("BlackWater Park", 12.11);
        albums.add(album);

        List<Song> playlist = new ArrayList<Song>();
        albums.get(0).addToPlaylist("Jurassic | Cretaceous", playlist);
        albums.get(0).addToPlaylist("Eocene", playlist);
        albums.get(0).addToPlaylist("Anthropocentric", playlist);
        albums.get(0).addToPlaylist(6, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(5, playlist);
        albums.get(1).addToPlaylist(45, playlist);

        play(playlist);

    }

    private static void play(List<Song> playlist) {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now Playing " + listIterator.next().toString());
            printMenu();
        }
        while(!quit) {
            int action = s.nextInt();
            s.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist is done");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now Playing " + listIterator.next().toString());
                    } else {
                        System.out.println("You've reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now Playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("You are at the start of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("At the start of the playlist");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("You have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions\n");
        System.out.println("0 - to quit \n" +
                "1 - to play next song \n" +
                "2 - to play previous song \n" +
                "3 - to replay current song \n" +
                "4 - to list all songs in playlist \n" +
                "5 - print available actions \n" +
                "6 - remove current song from playlist");
    }

    private static void printList(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("================");
    }
}

