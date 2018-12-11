package com.Exadel.Task1.UserContent;

import java.util.List;

public class Document implements Addable {


    private int id;
    private String title;
    private String text;
    private List<UserContentAbstract> userContentList;

    public Document(int id, String title, String text, List<UserContentAbstract> userContentList) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.userContentList = userContentList;
    }

   public void add(UserContentAbstract userContent){
       userContentList.add(userContent);


    }

    public List<UserContentAbstract> getUserContentList() {
        return userContentList;
    }



}
