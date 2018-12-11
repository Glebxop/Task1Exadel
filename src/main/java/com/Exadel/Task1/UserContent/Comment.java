package com.Exadel.Task1.UserContent;

import com.Exadel.Task1.Important.User;

public class Comment extends UserContentAbstract implements Showable {



    private String text;

    public Comment(int id, User user, String title, String text) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.text = text;
    }

    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }
}
