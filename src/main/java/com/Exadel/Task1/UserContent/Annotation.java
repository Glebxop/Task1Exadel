package com.Exadel.Task1.UserContent;

import com.Exadel.Task1.Important.User;

public class Annotation extends UserContentAbstract implements Showable {



    private int startPos;
    private int endPos;
    private String text;

    public String getTitle() {
        return title;
    }

    public Annotation(int id, User user, String title, String text) {
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
        return "Annotation{" +
                "id=" + id +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
