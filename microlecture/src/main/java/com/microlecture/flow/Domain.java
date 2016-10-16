package com.microlecture.flow;

import com.microlecture.common.domain.CommonDomain;

/**
 * Created by xuwushun on 2016/10/16.
 */
public class Domain extends CommonDomain{
    private Long id;
    private Long accountId;
    private String subject;
    private Double amount;
    private Byte type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }
}
