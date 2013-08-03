package com.springapp.mvc.models;

import org.joda.time.DateTime;

public class Comment {

    private Long id;
    private String content;
    private DateTime commentDate;
    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DateTime getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(DateTime commentDate) {
        this.commentDate = commentDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
