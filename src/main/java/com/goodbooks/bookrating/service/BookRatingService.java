package com.goodbooks.bookrating.service;

import com.goodbooks.bookrating.dao.BookRatingRepository;
import com.goodbooks.bookrating.entity.BookRating;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookRatingService {

    Logger logger = LoggerFactory.getLogger(BookRatingService.class);

    @Autowired
    public BookRatingRepository bookRatingRepository;

    public List<BookRating> getBooksRatedByUser(String userId) {
        logger.info("Looking up ratings provided by the user in Database and returning response.");
        return bookRatingRepository.findByUserId(userId);
    }
}
