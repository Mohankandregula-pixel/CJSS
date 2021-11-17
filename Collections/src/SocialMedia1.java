//            Customer
//        name
//        email
//
//            Posts - This will have list of posts like facebook posts
//        postId
//        email (Customer email)
//        heading
//        description
//
//            Comments - This will have details of comments given for each post
//        postId - For which post comment should be added
//        email - Who are giving comment
//        comment - message of comment
//
//            Tasks:
//
//        1) By using above classes(Customer, Posts, Comments) - Add some dummy data
//        2) Print all customer details (Name, email)
//        3) Print all Posts (customer name, heading, description)
//        4) Print all comments (post initiated customer name, heading, description, comment, commented customer name)

import Collections.*;
import java.util.List;
import java.util.ArrayList;

public class SocialMedia1 {
    public static void main( String args[]){

        List<Comments> commentsOfPost11 = new ArrayList<>();


        Comments comment1 = new Comments("p1","m@gmail.com","Nice");
        Comments comment2 = new Comments("p1","m@gmail.com","good");

        commentsOfPost11.add(comment1);
        commentsOfPost11.add(comment2);

        List<Comments> commentsOfPost12 = new ArrayList<>();


        Comments comment21 = new Comments("p2","m@gmail.com","Nice");
        Comments comment22 = new Comments("p2","m@gmail.com","good");

        commentsOfPost12.add(comment21);
        commentsOfPost12.add(comment22);

        List<Posts> postOfCustomer1 = new ArrayList<>();

        Posts post1 = new Posts("p1","m@gamil.com","birthday","Celebration",commentsOfPost11);
        Posts post2 = new Posts("p2","m@gamil.com","birthday","Celebration",commentsOfPost12);

        postOfCustomer1.add(post1);
        postOfCustomer1.add(post2);

        List<Posts> postOfCustomer2 = new ArrayList<>();

        Posts post21 = new Posts("p1","m@gamil.com","birthday","Celebration",commentsOfPost1);
        Posts post22 = new Posts("p2","m@gamil.com","birthday","Celebration",commentsOfPost12);

        postOfCustomer2.add(post1);
        postOfCustomer2.add(post2);

        Customer C1 = new Customer("Mohan","m@gamil.com",postOfCustomer1);
        Customer C2 = new Customer("nolan","n@gamil.com",postOfCustomer2);

        List<Customer> allCustomers = new ArrayList<>();

        allCustomers.add(C1);
        allCustomers.add(C2);


    }
}
