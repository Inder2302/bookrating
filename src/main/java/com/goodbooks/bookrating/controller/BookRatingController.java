package com.goodbooks.bookrating.controller;

import com.goodbooks.bookrating.entity.BookRating;
import com.goodbooks.bookrating.service.BookRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class BookRatingController {

    @Autowired
    private BookRatingService bookRatingService;

    @RequestMapping("/{userId}")
    public List<BookRating> getUserRating(@PathVariable("userId") String userId)  {
        return bookRatingService.getBooksRatedByUser(userId);
    }
}
