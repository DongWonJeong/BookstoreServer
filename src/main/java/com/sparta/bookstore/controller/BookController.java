package com.sparta.bookstore.controller;

import com.sparta.bookstore.dto.BookRequestDto;
import com.sparta.bookstore.dto.BookResponseDto;
import com.sparta.bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //도서 목록 조회
    @GetMapping("/books")
    public List<BookResponseDto> getBooks() {
        return bookService.getBooks();
    }

    //도서 정보 조회
    @GetMapping("/books/{bookid}")
    public BookResponseDto getBook(@PathVariable Long bookid) {
        return bookService.getBook(bookid);
    }

    //도서 등록
    @PostMapping("/books")
    public BookResponseDto createBook(@RequestBody BookRequestDto requestDto) {
        return bookService.createBook(requestDto);
    }

    //도서 대출

    //도서 반납

    //대출 내역 조회

}
