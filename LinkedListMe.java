import java.util.*;
  public class LinkedListMe {
    public static void main(String args[]){
	
	 LinkedList<String> songs = new LinkedList<>();
	 LinkedList<String> artist = new LinkedList<>();
	 LinkedList<String> playlist = new LinkedList<>();
	 
	 songs.add("Please Forgive Me");
     songs.add("Before You Go");
	 songs.add("On this Day");
	 songs.add("Jar of Hearts");
	 songs.add("Dangerous Woman");
	 
	 System.out.println (songs);
	 
	 artist.add("Bryan Adams");
	 artist.add("Lewis Capaldi");
	 artist.add("David Pomeranz");
	 artist.add("Christina Perri");
	 artist.add("Ariana Grande");
	 
	 System.out.println(artist);
	 
	 playlist.add(songs.get(0)+ "-" + artist.get(0));
	 playlist.add(songs.get(1)+ "-" + artist.get(1));
	 playlist.add(songs.get(2)+ "-" + artist.get(2));
	 playlist.add(songs.get(3)+ "-" + artist.get(3));
	 playlist.add(songs.get(4)+ "-" + artist.get(4));
	
	 
	 System.out.println(playlist.get(0));
	 System.out.println(playlist.get(1)); 
	 System.out.println(playlist.get(2));
	 System.out.println(playlist.get(3));
	 System.out.println(playlist.get(4));
	 
	 
	
	 
	 
	
	 
	 
	 
	 
	 
	 
	}
	
  }