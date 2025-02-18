import java.util.*;
public class Product {
    private Integer product_id;
    private String product_name;
    private float price;

    public Product(Integer product_id, String product_name, float price){
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }


    public static void createNewProduct(List<Product> productList,String p_name, float p_price){
        productList.add(new Product(productList.size()+1, p_name, p_price));
    }

    public String toString(){
        return product_id+"......."+product_name+"......"+price;
    }
}
