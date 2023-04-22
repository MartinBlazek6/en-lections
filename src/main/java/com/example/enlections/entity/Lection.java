package com.example.enlections.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Lection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lectionId;
    private String title;
    private String level;
    private String emails;

    public Lection(String title, String level) {
        this.title = title;
        this.level = level;
    }
}
