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

        List<Comments> commentsOfC1p1 = new ArrayList<>();


        Comments comment1C1p1 = new Comments("p11","m@gmail.com","Nice");
        Comments comment2C1p1 = new Comments("p11","m@gmail.com","good");

        commentsOfC1p1.add(comment1C1p1);
        commentsOfC1p1.add(comment2C1p1);

        List<Comments> commentsOfC1p2 = new ArrayList<>();


        Comments comment1C1p2 = new Comments("p12","m@gmail.com","Nice");
        Comments comment2C1p2 = new Comments("p12","m@gmail.com","good");

        commentsOfC1p2.add(comment1C1p2);
        commentsOfC1p2.add(comment2C1p2);

            List<Comments> commentsOfC2p1 = new ArrayList<>();


            Comments comment1C2p1 = new Comments("p21","k@gmail.com","Tik ");
            Comments comment2C2p1 = new Comments("p21","p@gmail.com","Tok");

            commentsOfC2p1.add(comment1C2p1);
            commentsOfC2p1.add(comment2C2p1);

                            List<Posts> C1p1 = new ArrayList<>();

                            Posts post1C1 = new Posts("p11","m@gamil.com","birthday","Celebration",commentsOfC1p1);

                            C1p1.add(post1C1);

//                                List<Posts> C1p2 = new ArrayList<>();
//
//                                Posts post2C1 = new Posts("p12","m@gamil.com","birthday","Celebration",commentsOfC1p2);
//
//                                C1p1.add(post2C1);

                            List<Posts> C2p1 = new ArrayList<>();

                            Posts post21 = new Posts("p21","m@gamil.com","birthday","Celebration",commentsOfC2p1);
                    //        Posts post22 = new Posts("p22","m@gamil.com","birthday","Celebration",commentsOfPost22);

                            C2p1.add(post21);
                    //        C2p1.add(post22);



        Customer C1 = new Customer("Mohan","m@gamil.com",C1p1);
//        Customer C1 = new Customer("Mohan","m@gamil.com",C1p2);
        Customer C2 = new Customer("nolan","n@gamil.com",C2p1);

        List<Customer> allCustomers = new ArrayList<>();

        allCustomers.add(C1);
        allCustomers.add(C2);
//        1) By using above classes(Customer, Posts, Comments) - Add some dummy data
//        2) Print all customer details (Name, email)


        for(Customer cust: allCustomers){
            System.out.println("Email: " + cust.getEmail() + "  Name: " + cust.getName());
        }
//        3) Print all Posts (customer name, heading, description)
        for(Posts postOfAll: C1p1){
            System.out.println("Heading: " + postOfAll.getHeading() + "/ Description: " + postOfAll.getDescription());
        }
        for(Posts postOfAll: C2p1){
            System.out.println("Heading: " +postOfAll.getHeading() +"/ Description: " + postOfAll.getDescription());
        }
//        4) Print all comments (post initiated customer name, heading, description, comment, commented customer name)
        for(Comments allComments: commentsOfC1p2){
            System.out.println("Comment:  " + allComments.getComment() + "/ Mail id : " + allComments.getEmail() + "/ Post id is : " +  allComments.getPostId());
        }

    }
}
