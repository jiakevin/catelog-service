package com.jiakevin.catalogservice.domain;

/**
 * @author jiakevin
 * @since 2023-05-06 22:58
 */
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
