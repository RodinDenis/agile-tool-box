package com.agile.toolbox.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class Response <T> {

    private List<T> data;

    private Status status;

    public Response(List<T> asList) {
    }

    public Response(List<T> data, Status status) {
        this.data = data;
        this.status = status;
    }
}
