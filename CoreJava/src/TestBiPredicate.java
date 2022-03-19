import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

class DVD {

    private String name;
    private int price;
    private String genre;

    public DVD(String name, int price, String genre) {
        this.name = name;
        this.price = price;
        this.genre = genre;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getGenre() {
        return this.genre;
    }
}

public class TestBiPredicate {

    public static void main(String args[]) {
        List<DVD> dvdList = new ArrayList<>();
        dvdList.add(new DVD("Terminator", 20, "Action"));
        dvdList.add(new DVD("Rambo", 30, "Action"));
        dvdList.add(new DVD("When Harry Met Sally", 10, "Romantic"));
		
        BiPredicate<Integer, String> priceBuy = (price, genre) -> price < 30;  
        BiPredicate<Integer, String> genreBuy = (price, genre) 
            -> genre.equalsIgnoreCase("Action");
        BiPredicate<Integer, String> finalBuy = priceBuy.and(genreBuy);
        
        dvdList.forEach(dvd -> {
            if (finalBuy.test(dvd.getPrice(), dvd.getGenre())) {
                System.out.println("You can buy " + dvd.getName());
            }
        });
    }
}	