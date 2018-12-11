package com.Exadel.Task1.Important;


import com.Exadel.Task1.Compare.CompareComments;
import com.Exadel.Task1.UserContent.*;

import java.util.*;



public class Main {
    public static void main(String[] args) {


        System.out.println("1) Create 3 users. Print"+"\n");


        User once=new User(0,"Vasia","Vasia@gmail.com");
        User twice=new User(1,"Kolia","Kolia@gmail.com");
        User thrice=new User(2,"Petia","Petia@mail");
        once.print();
        twice.print();
        thrice.print();


        System.out.println("\n"+"2) Create user contents of different types. Print"+"\n");


        Comment comment=new Comment(1,once,"Short","Text comment");
        Annotation annotation=new Annotation(2,twice,"LongWery","Text annotation");
        Attachment attachment=new Attachment(54,thrice,"Average",3.28);
        comment.show();
        annotation.show();
        attachment.download();


        System.out.println("\n"+"3) Create list of comments. Sort them by titles (ascending). Print"+"\n");


        ArrayList<Comment>arrayListComment=new ArrayList<Comment>();
        arrayListComment.add(new Comment(34,once,"TitleComm18","TextComm1"));
        arrayListComment.add(new Comment(345,once,"TitleComm1Long","TextComm1"));
        arrayListComment.add(new Comment(456,once,"Comm1short","TextComm1"));
        System.out.println(arrayListComment.toString());
        Collections.sort(arrayListComment,new CompareComments());
        System.out.println(arrayListComment.toString());


        System.out.println("\n"+"4) Create map \"user - list of user contents\". Print how many user contents each user has"+"\n");



        Map<User, List<UserContentAbstract>> mapUserContent=new HashMap<User, List<UserContentAbstract>>();


        System.out.println("\n"+"5) Create set of attachments sorted by fileSize (descending). Print"+"\n");



        Set<Attachment>sortAttacment=new TreeSet<Attachment>();
        sortAttacment.add(new Attachment(23,twice,"TitleOne",3.14));
        sortAttacment.add(new Attachment(24,twice,"TitleFive",2.16));
        sortAttacment.add(new Attachment(27,twice,"TitleSix",4.10));
        System.out.println(sortAttacment.toString());


        System.out.println("\n"+"6) Create document. Add all of created user contents to this document. Sort userContentList by titles (descending). Print"+"\n");


        Document documentMy=new Document(1,"TitleDocMy","DocumentText",new ArrayList<UserContentAbstract>());
        documentMy.add(comment);
        documentMy.add(annotation);
        documentMy.add(attachment);
        System.out.println(documentMy.getUserContentList());
        Collections.sort(documentMy.getUserContentList(),new CompareComments());
        System.out.println(documentMy.getUserContentList());





    }
}
