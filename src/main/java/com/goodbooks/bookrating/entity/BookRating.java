package com.goodbooks.bookrating.entity;

import javax.persistence.*;

@Entity
@Table(name="book_rating")
public class BookRating {

    @Id
    @Column(name="serial_number")
    private Integer serialNumber;
    @Column(name="user_id")
    private String userId;
    @Column(name="book_id")
    private String bookId;
    @Column(name="rating")
    private String rating;

    public BookRating(Integer serialNumber, String userId, String bookId, String rating) {
        this.serialNumber = serialNumber;
        this.userId = userId;
        this.bookId = bookId;
        this.rating = rating;
    }
    public BookRating() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
}
