# URL Shortener Service

## Design Choices
- Used Spring Boot for rapid development and easy configuration.
- Utilized H2 in-memory database for simplicity and demonstration purposes.
- Implemented basic authentication using Spring Security.
- Used Lombok to reduce boilerplate code for model classes.
- Added logging with Logback for monitoring and debugging.

## Implementation Details
- **URL Shortener Logic**: Generates a random alphanumeric string for short URLs.
- **Persistence**: Uses Spring Data JPA to manage URL mappings in an H2 database.
- **API Endpoints**: 
  - POST `/api/shorten`: Accepts a long URL and returns a short URL.
  - GET `/api/{shortUrl}`: Redirects to the long URL associated with the short URL.
- **Logging**: Logs all URL shortening and retrieval operations.

## Design Patterns
- **Singleton**: Used for `UrlShortenerUtil` to ensure a single instance for URL generation logic.
- **Repository Pattern**: Used to separate data access logic in `UrlMappingRepository`.

## Running the Application
1. Clone the repository.
2. Run `mvn spring-boot:run`.
3. Use a tool like Postman to interact with the API.

## Testing
- Unit tests are written using JUnit and Mockito.
- To run tests, use `mvn test`.

