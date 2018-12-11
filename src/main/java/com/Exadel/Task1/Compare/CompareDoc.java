package com.Exadel.Task1.Compare;

import com.Exadel.Task1.UserContent.UserContentAbstract;

import java.util.Comparator;

public class CompareDoc implements Comparator<UserContentAbstract> {

    public int compare(UserContentAbstract o1, UserContentAbstract o2) {
       if (o1.getTitle().length()>o2.getTitle().length())
               return -1;
       else if (o1.getTitle().length()<o2.getTitle().length())
           return 1;
       else return 0;

    }

    public int compare() {
        return 0;
    }
}
