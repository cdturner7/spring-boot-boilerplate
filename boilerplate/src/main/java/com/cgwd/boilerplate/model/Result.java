/*
 *******************************************************************************
 * Project: Boilerplate
 *
 * Author: Collin Turner
 * =============================================================================
 * (c) Copyright 2025 Code Green Web Design All rights reserved.
 *******************************************************************************
*/

package com.cgwd.boilerplate.model;

public class Result<T extends Object> {

    enum Status {
        Successful, 
        Error
    }

    private Status status;

    private T data;

    public Result() {
        this.status = Status.Successful;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.status);
        if (data != null) {
            stringBuilder.append("\n");
            stringBuilder.append(data.toString());
        } 
        return stringBuilder.toString();
    }

}
