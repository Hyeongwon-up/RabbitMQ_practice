package com.hw.rabbitmq.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@RequiredArgsConstructor
@Document(collection = "attempts")
public class Attempt implements Serializable {

    @Id
    private long id;

    private final User user;
    private final Quiz quiz;
    private final int resultAttribute;
    private final boolean correct;


}
