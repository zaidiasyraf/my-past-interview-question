package com.zaidi.cxrus.customer;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {


    @Query(value = "SELECT Customers.CustomerID FROM Customers JOIN Orders ON Orders.CustomerID = Customers.CustomerID WHERE Orders.OrderDate BETWEEN ?1 AND ?2 GROUP BY Customers.CustomerID ORDER BY COUNT(*) DESC LIMIT 10", nativeQuery = true)
    List<Long> findCustomerMostOrderBetween(LocalDate start, LocalDate end);
}
