DROP TABLE IF EXISTS book_rating;
create table book_rating (
    serial_number INTEGER,
    user_id VARCHAR(10),
    book_id VARCHAR(10),
    rating NUMBER
);
insert into book_rating values('1','user1', '1', 5);
insert into book_rating values('2','user1', '2', 4.5);
insert into book_rating values('3','user1', '6', 4);
insert into book_rating values('4','user2', '3', 3.5);
insert into book_rating values('5','user2', '4', 3.5);
insert into book_rating values('6','user2', '5', 4);
insert into book_rating values('7','user2', '7', 4.5);
insert into book_rating values('8','user2', '8', 4.5);