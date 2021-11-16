import Collections.*;
import java.util.List;
import java.util.ArrayList;

public class SocialMedia1 {
    public static void main( String args[]){

        List<Comments> commentsOfPost1 = new ArrayList<>();


        Comments comment1 = new Comments("p1","m@gmail.com","Nice");
        Comments comment2 = new Comments("p1","m@gmail.com","good");

        commentsOfPost1.add(comment1);
        commentsOfPost1.add(comment2);

        List<Comments> commentsOfPost2 = new ArrayList<>();


        Comments comment21 = new Comments("p2","m@gmail.com","Nice");
        Comments comment22 = new Comments("p2","m@gmail.com","good");

        commentsOfPost2.add(comment21);
        commentsOfPost2.add(comment22);

        List<Posts> postOfCustomer1 = new ArrayList<>();

        Posts post1 = new Posts("p1","m@gamil.com","birthday","Celebration",commentsOfPost1);
        Posts post2 = new Posts("p2","m@gamil.com","birthday","Celebration",commentsOfPost2);

        postOfCustomer1.add(post1);
        postOfCustomer1.add(post2);

        Customer C1 = new Customer("Mohan","m@gamil.com",postOfCustomer1);
        Customer C2 = new Customer("nolan","n@gamil.com",postOfCustomer2);

        List<Customer> allCustomers = new ArrayList<>();

        allCustomers.add(C1);
        allCustomers.add(C2);


    }
}
