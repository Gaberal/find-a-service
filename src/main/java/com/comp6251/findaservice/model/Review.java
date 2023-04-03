package com.comp6251.findaservice.model;

import lombok.Data;

import java.time.ZonedDateTime;
@Data
public class Review {
    private Long id;
    private Customer customer;
    private Service service;
    private int rating;
    private String comment;
    private ZonedDateTime timestamp;

}
