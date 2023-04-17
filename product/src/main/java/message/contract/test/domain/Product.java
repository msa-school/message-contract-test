package message.contract.test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import message.contract.test.ProductApplication;
import message.contract.test.domain.ProductChanged;

@Entity
@Table(name = "Product_table")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private Float productPrice;

    private Integer productStock;

    private String imageUrl;

    @PostUpdate
    public void onPostUpdate() {
        ProductChanged productChanged = new ProductChanged(this);
        productChanged.publishAfterCommit();
    }

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }

    public static void stockChange(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        ProductChanged productChanged = new ProductChanged(product);
        productChanged.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);

            ProductChanged productChanged = new ProductChanged(product);
            productChanged.publishAfterCommit();

         });
        */

    }
}
