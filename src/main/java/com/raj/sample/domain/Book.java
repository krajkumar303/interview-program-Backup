package com.raj.sample.domain;

import com.raj.sample.domain.Author;

import java.util.Date;
import java.util.List;

public class Book {

  String isbn;
  String name;
  List<Author> authors;
  Date publishedDate;

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Author> authors) {
    this.authors = authors;
  }

  public Date getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
  }

  @Override
  public String toString() {
    return "Book [isbn=" + isbn + ", name=" + name + ", authors=" + authors + ", publishedDate="
        + publishedDate + "]";
  }

  
}
