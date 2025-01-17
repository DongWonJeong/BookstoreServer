package com.sparta.bookstore.dto;

import com.sparta.bookstore.entity.Book;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class BookResponseDto {

    // 아이디
    private Long bookId;

    //제목
    private String title;

    //저자
    private String writer;

    //출판사
    private String publish;

    //등록일
    private LocalDate nowDate;

    public BookResponseDto(Book book) {
        this.bookId = book.getBookId();
        this.title = book.getTitle();
        this.writer = book.getWriter();
        this.publish = book.getPublish();
        this.nowDate = book.getNowDate();
    }
}
