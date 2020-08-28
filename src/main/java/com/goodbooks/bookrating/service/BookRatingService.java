package com.goodbooks.bookrating.service;

import com.goodbooks.bookrating.dao.BookRatingRepository;
import com.goodbooks.bookrating.entity.BookRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookRatingService {

    @Autowired
    public BookRatingRepository bookRatingRepository;

    public List<BookRating> getBooksRatedByUser(String userId) {
        return bookRatingRepository.findByUserId(userId);
    }
}
