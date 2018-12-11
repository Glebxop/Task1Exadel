package com.Exadel.Task1.UserContent;

import com.Exadel.Task1.Important.User;

public class Attachment extends UserContentAbstract implements Downlable, Comparable<Attachment> {



    private double fileSize;

    public Attachment(int id, User user, String title, double fileSize) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.fileSize = fileSize;
    }

    public void download(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "id=" + id +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getTitle() {
        return title;
    }



    public int compareTo(Attachment o) {
        if (fileSize<o.getFileSize())
            return 1;
        else if (fileSize>o.getFileSize())
            return -1;
        else return 0;
    }
}
