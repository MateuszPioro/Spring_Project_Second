package com.secondweekspring.posejdon.module.blog;

public class PostForm {

    public String title;
    public String text;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public PostForm setTitle(String title) {
        this.title = title;
        return this;
    }

    public PostForm setText(String text) {
        this.text = text;
        return this;
    }
}
