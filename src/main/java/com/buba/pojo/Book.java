package com.buba.pojo;


public class Book {

  private long id;
  private long firstMenuId;
  private long secondMenuId;
  private String bookNo;
  private String bookName;
  private long isbn;
  private String press;
  private String author;
  private String price;
  private long total;
  private long remainder;
  private long isDel;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getFirstMenuId() {
    return firstMenuId;
  }

  public void setFirstMenuId(long firstMenuId) {
    this.firstMenuId = firstMenuId;
  }


  public long getSecondMenuId() {
    return secondMenuId;
  }

  public void setSecondMenuId(long secondMenuId) {
    this.secondMenuId = secondMenuId;
  }


  public String getBookNo() {
    return bookNo;
  }

  public void setBookNo(String bookNo) {
    this.bookNo = bookNo;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public long getIsbn() {
    return isbn;
  }

  public void setIsbn(long isbn) {
    this.isbn = isbn;
  }


  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }


  public long getRemainder() {
    return remainder;
  }

  public void setRemainder(long remainder) {
    this.remainder = remainder;
  }


  public long getIsDel() {
    return isDel;
  }

  public void setIsDel(long isDel) {
    this.isDel = isDel;
  }

}
