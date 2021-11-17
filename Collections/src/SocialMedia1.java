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


        Comments comment11 = new Comments("p11","m@gmail.com","Nice");
        Comments comment12 = new Comments("p11","m@gmail.com","good");

        commentsOfPost11.add(comment11);
        commentsOfPost11.add(comment12);

        List<Comments> commentsOfPost12 = new ArrayList<>();


        Comments comment121 = new Comments("p12","m@gmail.com","Nice");
        Comments comment122 = new Comments("p12","m@gmail.com","good");

        commentsOfPost12.add(comment121);
        commentsOfPost12.add(comment122);

        List<Comments> commentsOfPost21 = new ArrayList<>();


        Comments comment21 = new Comments("p21","m@gmail.com","Nice");
        Comments comment22 = new Comments("p21","m@gmail.com","good");

        commentsOfPost21.add(comment21);
        commentsOfPost21.add(comment22);

        List<Posts> postOfCustomer1 = new ArrayList<>();

        Posts post11 = new Posts("p11","m@gamil.com","birthday","Celebration",commentsOfPost11);
        Posts post12 = new Posts("p12","m@gamil.com","birthday","Celebration",commentsOfPost12);

        postOfCustomer1.add(post11);
        postOfCustomer1.add(post12);

        List<Posts> postOfCustomer2 = new ArrayList<>();

        Posts post21 = new Posts("p21","m@gamil.com","birthday","Celebration",commentsOfPost21);
//        Posts post22 = new Posts("p22","m@gamil.com","birthday","Celebration",commentsOfPost22);

        postOfCustomer2.add(post21);
//        postOfCustomer2.add(post22);

        Customer C1 = new Customer("Mohan","m@gamil.com",postOfCustomer1);
        Customer C2 = new Customer("nolan","n@gamil.com",postOfCustomer2);

        List<Customer> allCustomers = new ArrayList<>();

        allCustomers.add(C1);
        allCustomers.add(C2);

        for(Customer cust: allCustomers){
            System.out.println(cust.getEmail());
        }

    }
}
