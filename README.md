# kirana_Register
The Kirana Management System is a Java-based application designed to manage transactions and store owner information in a Kirana store.

## Project Structure

The project is organized into several packages, each serving a specific purpose:

- `com.kirana.management.model`: Contains the entity classes representing the data model.
- `com.kirana.management.dto`: Contains Data Transfer Objects (DTOs) used for communication.
- `com.kirana.management.repository`: Provides Spring Data JPA repositories for database interaction.
- `com.kirana.management.service`: Defines service interfaces and their implementations for business logic.
- `com.kirana.management.controller`: Contains controllers handling HTTP requests.

## How to run

-I have use H2 database so you can directly run this code and spring will automatically establish connection to the database.
-start the main spring function and 
-Use postman for check api endpoint.

## Tech and Others

-Java 20 
-Spring boot 3.1.0
-H2 Database
-IntellijIDE
-Postman
-API for currency rate -> https://api.fxratesapi.com/latest

<br />

## Screenshots of some results.
1. New Store Owner : it can be done using - http://localhost:8080/api/storeOwner/create and passing ownerName , storeAddress and balanceINR as request body.

![image](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/0548c3e5-33b2-4ce9-906f-1eca2fe06448)


2. New Transaction : it can be done using - http://localhost:8080/api/transaction/new and passing type , transactionAmount and date as request body. This will return transaction json response with all the required information. Trannsaction will affect the balanceAmount of owner.

![image](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/9b05a2db-ac9f-4d76-8e71-29ee1fe70c00)


3. All Transaction by Type : it can be done using - http://localhost:8080/api/transaction/all/debit it can be credit also. This will return list of all transaction of specific type.

![image](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/11b33b29-c8b9-469a-a2a9-1d024b293573)


4. All Transaction by Date : it can be done using - http://localhost:8080/api/transaction/all/date/2020-01-11 in this date should be of "yyyy-MM-dd" pattern. This will return list of transaction occur on the given date.

![image](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/b7961771-6196-4751-bec5-818fa30bb00d)

