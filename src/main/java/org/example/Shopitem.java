import java.util.List;
import java.util.Optional;

public static class ShopItem {
    private final int ID;
    private final String name;
    private final int category;

    public ShopItem(int anID, String aName, int aCategory) {
        this.ID = anID;
        this.name = aName;
        this.category = aCategory;
    }

    public int getID() { return this.ID; }

    public String getName() { return this.name; }

    public int getCategory() { return this.category; }

   }

public void main() {
}
public static class Category {


    private final Object name2;
    private final Object name3;
    private final Object Clothes;
    private final Object Electronics;
    private final Object Fruits;
    private String name;


    public Category (String name, Object clothes, Object electronics, Object fruits) {
        Clothes = clothes;
        Electronics = electronics;
        Fruits = fruits;

        Object name1 = Clothes;
        this.name2 = Electronics;
        this.name3 = Fruits;

    }

    public String getName() {
        return this.name;
    }
}
public static class Shop<T extends ShopItem> {
    private Shop<T> wrapped;
    public void setWrapped(Shop<? extends ShopItem> input) {
        wrapped = (Shop<T>) input;
    }

    public Shop<T> getWrapped() {
        return wrapped;
    }
}
public static class Shopping {

    public Shopping(int price) {
    }

    List<ShopItem> findByCategory(Category cat):List<Shop>;



        List<ShopItem> findWithLowerPrice ( int maxPrice) :List<Shop> ;
        public int findWithLowerPrice () {
        double max = 0;
        int maxPrice = 0;
            for(int i =0; i < maxPrice; i++) {
                if(max <= maxPrice[i].getPrice()) {
                    max = maxPrice[i].getPrice();
                    return i;
                }
            }
            return -1;

    }

        List<ShopItem> findByName (String name) :Optional<Shop> ;

        List<ShopItem> removeItem (String name):Optional<Shop> ;
    }
