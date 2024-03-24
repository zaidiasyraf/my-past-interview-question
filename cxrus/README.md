
# Cxrus Java Interview

This is the answer for Cxrus java Interview




## SQL Q&A

#### List all the customer names who do not have any single order.

```http
  SELECT ContactName FROM Customers WHERE CustomerID NOT IN (SELECT CustomerID FROM Orders)
```
#### List all the unique customer names who had ordered products that contain the word “Lager”.

```http
  SELECT DISTINCT(Customers.ContactName) FROM Products JOIN Order_Details ON Order_Details.ProductID = Products.ProductID JOIN Orders ON Orders.OrderID = Order_Details.OrderID JOIN Customers ON Customers.CustomerID = Orders.CustomerID WHERE Products.ProductName LIKE '%Lager%';
```
#### For each customer, display the number of orders with the order date in the year of 1998.

```http
  SELECT Customers.CustomerID, COUNT(*) FROM Customers JOIN Orders ON Orders.CustomerID = Customers.CustomerID WHERE YEAR(Orders.OrderDate) = 1998 GROUP BY Customers.CustomerID;
```
## API Reference

#### Get Top 10 Customer with most order given date rance

```http
  curl --location --request GET 'http://localhost:8080/user/order/top10/{start}/{end}'
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `start` | `string` | **Required**. start date 'yyyy-MM-dd' |
| `end` | `string` | **Required**. end date 'yyyy-MM-dd' |





## FAQ

#### Dependency

Mysql 5.7. Configure in application.properties

#### Is there any test data

Yes, you may use the test data under dump folder

