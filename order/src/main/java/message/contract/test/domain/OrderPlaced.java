package message.contract.test.domain;

import java.util.*;
import lombok.*;
import message.contract.test.domain.*;
import message.contract.test.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productName;
    private Integer qty;
    private Long productId;
    private Long customerId;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
