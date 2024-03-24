package com.zaidi.cxrus.order;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.zaidi.cxrus.customer.Customer;
import lombok.Data;

@Entity
@Data
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID", unique = true)
    private Long id;

    @Column(name = "OrderDate")
    private LocalDate orderDate;

    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;
}
