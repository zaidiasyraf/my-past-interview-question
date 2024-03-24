package com.zaidi.cxrus.customer;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    // List all top 10 customer id from the highest order in given date range
    @GetMapping("/order/top10/{start}/{end}")
    public List<Long> top(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate start, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        return customerRepo.findCustomerMostOrderBetween(start, end);
    }

}
