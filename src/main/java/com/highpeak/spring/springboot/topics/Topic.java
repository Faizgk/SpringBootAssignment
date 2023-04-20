package com.highpeak.spring.springboot.topics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Topic {

    @Id
    public String id;
    public String name;
    public String description;


    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
