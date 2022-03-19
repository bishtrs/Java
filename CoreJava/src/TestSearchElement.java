import java.util.Arrays;
import java.util.Comparator;

class Actor {
    private String name;
    private int rank;
	
    Actor (String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
	
    public String getName() {
        return name;
    }
	
    public int getRank() {
        return rank;
    }
	
    @Override
    public String toString() {
        return "Actor [name=" + name + ", rank=" + rank + "]";
    }	
}

// Sorts using Comparator by rank of Actor		
class ActorRankComparator implements Comparator<Actor>{

    public int compare(Actor actor1, Actor actor2) {
        return (actor1.getRank() < actor2.getRank()) ?
            -1 : ((actor1.getRank() == actor2.getRank()) ? 0 : 1);
    }
}

public class TestSearchElement {
    public static void main(String[] args) {
        Actor[] actors = new Actor[3];
        actors[0] = new Actor("Harry", 5);
        actors[1] = new Actor("IronMan", 2);
        actors[2] = new Actor("Batman", 7);
        
        System.out.println("Before sorting");
        for (Actor actor : actors)     
            System.out.println(actor);
        
        ActorRankComparator comparator = new ActorRankComparator();
        
        Arrays.sort(actors, comparator);
        
        System.out.println("After sorting");
        for (Actor actor : actors)     
            System.out.println(actor);
        
        System.out.println("index of actor Harry in sorted array  " +
            Arrays.binarySearch(actors, new Actor("Harry", 5), comparator));
    }
}