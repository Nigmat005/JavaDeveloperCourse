package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "carts")
@Data
@NoArgsConstructor
public class Cart extends BaseEntity{

    @ManyToMany
    @JoinTable(name = "cart_item_rel",
            joinColumns = @JoinColumn(name = "cart_Id"),
    inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> itemList;
}
