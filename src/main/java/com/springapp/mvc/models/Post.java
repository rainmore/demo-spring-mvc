package com.springapp.mvc.models;

import org.joda.time.DateTime;

public class Post {

    private Long id;
    private String title;
    private String content;
    private DateTime publicDate;

    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DateTime getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(DateTime publicDate) {
        this.publicDate = publicDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
