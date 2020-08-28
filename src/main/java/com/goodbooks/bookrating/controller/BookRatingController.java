package com.goodbooks.bookrating.controller;

import com.goodbooks.bookrating.entity.BookRating;
import com.goodbooks.bookrating.service.BookRatingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class BookRatingController {

    Logger logger = LoggerFactory.getLogger(BookRatingController.class);

    @Autowired
    private BookRatingService bookRatingService;

    @RequestMapping("/{userId}")
    public List<BookRating> getUserRating(@PathVariable("userId") String userId)  {
        logger.info("Got a request for fetching books rated by user - {}", userId);
        return bookRatingService.getBooksRatedByUser(userId);
    }
}
