interface Discountable{
    void discountOfProduct(int discount);
}

abstract class Product implements Discountable{
    private int productId,price, quantity;
    private String name;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(int productId, int price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    abstract int totalPrice();
    abstract public void details();
}


class ElectronicsProducts extends Product{

    public ElectronicsProducts(int productId, int price, int quantity) {
        super(productId, price, quantity);
    }
    @Override
    int totalPrice() {
        return getQuantity()*getPrice();
    }

    @Override
    public void details() {
        System.out.println("Name: "+getName());
        System.out.println("Product id: "+getProductId());
        System.out.println("Price: "+getPrice());
    }

    @Override
    public void discountOfProduct(int discount) {
        int newPrice = getPrice()*(5/100);
        setPrice(newPrice);
    }
}
class ClothingProducts extends Product{

    public ClothingProducts(int productId, int price, int quantity) {
        super(productId, price, quantity);
    }

    @Override
    public int totalPrice() {
        return getQuantity()*getPrice();
    }

    @Override
    public void details() {
        System.out.println("Name: "+getName());
        System.out.println("Product id: "+getProductId());
        System.out.println("Price: "+getPrice());
    }

    @Override
    public void discountOfProduct(int discount) {
        int newPrice = getPrice()*(5/100);
        setPrice(newPrice);
    }
}
class BookProducts extends Product{

    public BookProducts(int productId, int price, int quantity) {
        super(productId, price, quantity);
    }

    @Override
    int totalPrice() {
        return getQuantity()*getPrice();
    }

    @Override
    public void details() {
        System.out.println("Name: "+getName());
        System.out.println("Product id: "+getProductId());
        System.out.println("Price: "+getPrice());
    }

    @Override
    public void discountOfProduct(int discount) {
        int newPrice = getPrice()*(5/100);
        setPrice(newPrice);
    }
}
public class Shop {
    public static void main(String[] args) {
        
        Product electric = new ElectronicsProducts(101, 5, 5);

        System.out.println(electric.totalPrice());
    }

}