package com.base.demo.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
@Scope("prototype")

public class BaseObjectVo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private int page;

    private int pageRow;

    private String tosort;

    private String sorting;


    private String Token;

    private String userToken;

    private int status;


    private String classifySon;

    private double paginalNumber;



    private int AllDataCount;

    private int parentsId;

    private Date timestamp;


    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public int getParentsId() {
        return parentsId;
    }

    public void setParentsId(int parentsId) {
        this.parentsId = parentsId;
    }


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageRow() {
        return pageRow;
    }

    public void setPageRow(int pageRow) {
        this.pageRow = pageRow;
    }

    public String getTosort() {
        return tosort;
    }

    public void setTosort(String tosort) {
        this.tosort = tosort;
    }

    public String getSorting() {
        return sorting;
    }

    public void setSorting(String sorting) {
        this.sorting = sorting;
    }


    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }


    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getClassifySon() {
        return classifySon;
    }

    public void setClassifySon(String classifySon) {
        this.classifySon = classifySon;
    }

    public double getPaginalNumber() {
        return paginalNumber;
    }

    public void setPaginalNumber(double paginalNumber) {
        this.paginalNumber = paginalNumber;
    }

    public int getAllDataCount() {
        return AllDataCount;
    }

    public void setAllDataCount(int allDataCount) {
        AllDataCount = allDataCount;
    }


}
