DROP TABLE IF EXISTS book_rating;
create table book_rating (
    serial_number INTEGER,
    user_id VARCHAR(10),
    book_id VARCHAR(10),
    rating NUMBER
);
insert into book_rating values('1','user1', '1', 5);
insert into book_rating values('2','user1', '2', 4.5);
insert into book_rating values('3','user2', '2', 4);
insert into book_rating values('4','user2', '3', 3.5);