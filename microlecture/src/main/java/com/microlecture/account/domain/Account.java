package com.microlecture.account.domain;

import com.microlecture.common.domain.CommonDomain;

import java.util.Date;

/**
 * Created by xuwushun on 2016/10/16.
 */
public class Account extends CommonDomain{
    private Long id;
    private Long userId;
    private Double balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
