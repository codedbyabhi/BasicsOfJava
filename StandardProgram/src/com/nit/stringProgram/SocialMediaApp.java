package com.nit.stringProgram;
import java.util.*;

public class SocialMediaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName=sc.nextLine();
        String company=sc.nextLine();
        String postId=sc.nextLine();
        String contentType=sc.nextLine();
        int likes = sc.nextInt();
        int comments = sc.nextInt();
        int shares = sc.nextInt();

        if(likes<=0){
            System.out.println("Error: Engagement values must be non-negative");
            return;
        }
        EngagementPost ep = new EngagementPost(userName,company,postId,contentType,likes,comments,shares);
        System.out.println(ep);
 
    }
}
class UserProfile{
    public String userName;
    public String country;

    UserProfile(String userName, String country){
        this.userName=userName;
        this.country=country;
    }

    public String toString(){
        return "User[username="+userName+", country="+country+"],";
    }  
}
class Post extends UserProfile{
    public String postId;
    public String contentType;

    Post(String userName, String country, String postId, String contentType){
        super(userName, country);
        this.postId=postId;
        this.contentType=contentType;
    }

    public String toString(){
        return super.toString()+"Post[id="+postId+", type="+contentType+"],";
    }
}
class EngagementPost extends Post{
     public int likes;
     public int comments;
     public int shares;

     EngagementPost(String userName, String country, String postId, String contentType, int likes, int comments, int shares){
        super(userName,country,postId,contentType);
        this.likes=likes;
        this.comments=comments;
        this.shares=shares;
     }

     public String toString(){
        return super.toString()+"Engagement[likes="+likes+", comments="+comments+", shares="+shares+"]";
     }
}
