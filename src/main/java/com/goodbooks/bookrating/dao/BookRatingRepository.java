package com.goodbooks.bookrating.dao;

import com.goodbooks.bookrating.entity.BookRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRatingRepository extends JpaRepository<BookRating, Integer> {
    List<BookRating> findByUserId(String userId);
}
