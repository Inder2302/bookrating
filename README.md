# bookrating
A springboot project to manage ratings of books by user.

Controller endpoints:

http://<ip>:8082/goodbooks/rating/<userid>

Output Json example:

[
    {
        "userId": "user2",
        "bookId": "3",
        "rating": "3.5"
    },
    {
        "userId": "user2",
        "bookId": "4",
        "rating": "3.5"
    }
 ] 
 
Port can be configured in application.yml

Database used is H2 in-memory database. H2 console: http://<ip>:8082/h2
  
H2 url: jdbc:h2:mem:ratingdb
