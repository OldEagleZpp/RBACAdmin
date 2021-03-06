package com.spring.param;

import java.util.Date;

/**
 * @Author: Jeremy
 * @Date: 2018/5/11
 * @Time: 14:39
 * @Version: 1.0
 * @Describe:
 */
public class UserFilter {

    private Integer pageNo;

    private Integer pageSize;

    private String userName;

    private String phone;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
