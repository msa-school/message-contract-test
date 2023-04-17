package message.contract.test.domain;

import java.util.*;
import lombok.*;
import message.contract.test.domain.*;
import message.contract.test.infra.AbstractEvent;

@Data
@ToString
public class ProductChanged extends AbstractEvent {

    private Long id;
    private String productName;
    private Float productPrice;
    private Integer productStock;
    private String imageUrl;

    public ProductChanged(Product aggregate) {
        super(aggregate);
    }

    public ProductChanged() {
        super();
    }
}
