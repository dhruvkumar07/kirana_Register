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

## Screenshots of some results.
1.New Store Owner : it can be done using - http://localhost:8080/api/storeOwner/create and passing ownerName , storeAddress and balanceINR as request body.

![image](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/0548c3e5-33b2-4ce9-906f-1eca2fe06448)


![Screenshot 2024-01-04 111845](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/504d1cf5-7ba6-424d-8e31-60ef3b570380)
![Screenshot 2024-01-04 111822](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/2594e003-3c45-4b46-8ac6-e214a199fc30)
![Screenshot 2024-01-04 134634](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/b461ac95-c167-4c6d-99c6-5fae8ca18fb7)
![Screenshot 2024-01-04 115233](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/cedf34ee-c71b-4582-b50d-58c595337fec)
![Screenshot 2024-01-04 115118](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/fd3aa688-db82-411b-b89a-f91238294e7b)
![Screenshot 2024-01-04 111942](https://github.com/dhruvkumar07/kirana_Register/assets/83705135/1082b0e4-461b-43eb-8a19-4fd415ee1a3b)
