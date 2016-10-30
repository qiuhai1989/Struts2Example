package com.topwqp.entity;

import com.opensymphony.xwork2.interceptor.Interceptor;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/10/30 0030.
 */
public class Student implements Serializable {

    private Integer sno;

    private String sname;

    private String sdree;

    private Integer age;

    private String ssex;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSdree() {
        return sdree;
    }

    public void setSdree(String sdree) {
        this.sdree = sdree;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }
}
