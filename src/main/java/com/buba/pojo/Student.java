package com.buba.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {

  private long id;
  private long userId;
  private String studentCode;
  private String studentName;
  private String sex;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date startTime;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date endTime;
  private String phone;
  private long isDel;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getStudentCode() {
    return studentCode;
  }

  public void setStudentCode(String studentCode) {
    this.studentCode = studentCode;
  }


  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
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


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public long getIsDel() {
    return isDel;
  }

  public void setIsDel(long isDel) {
    this.isDel = isDel;
  }

}
