# Demo Project of Teiid Spring Boot

## Overview
![alt text](doc/images/overview.png)
The project demostrated how to use [Teiid Spring Boot](https://github.com/teiid/teiid-spring-boot) runtime on joining `product_symbols` table of H2 database and `product_data.csv` file with `productId` column and then created a `product` view. The `product` view then exposed as OData API that can be accessed by Excel, PowerBI, Java application, .Net application, etc.

## Execution
Execute the following command to run the project locally:
```
gradlew bootRun
```

Access the OData endpoint with the following URL:
```
http://localhost:8080/odata/product?$format=json
```
