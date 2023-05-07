package com.jiakevin.catalogservice.domain;

/**
 * @author jiakevin
 * @since 2023-05-06 22:57
 */
public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exist.");
    }
}
