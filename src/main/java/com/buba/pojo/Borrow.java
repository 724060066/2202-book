package com.buba.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Borrow {

  private long id;
  private long studentId;
  private long bookId;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date startTime;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date endTime;
  private long status;
  private long isDel;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }


  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }


  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }


  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getIsDel() {
    return isDel;
  }

  public void setIsDel(long isDel) {
    this.isDel = isDel;
  }

}
