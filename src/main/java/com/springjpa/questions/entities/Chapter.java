package com.springjpa.questions.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "chapters")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    // @JoinColumn(name = "survey_id")
    private Survey survey;

    @JoinColumn(name = "chapter_number")
    private String chapterNumber;

    @JoinColumn(name = "chapter_title")
    private String chapterTitle;

}
