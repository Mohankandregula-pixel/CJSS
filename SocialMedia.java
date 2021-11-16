import java.time.temporal.ValueRange;
import java.util.*;

public class SocialMedia {

    public static void main(String args[]){

    HashMap<String,String> Customer=new HashMap<String,String>();//Creating HashMap    
    Customer.put("Mohan","Mohan@gmail.com");  //Put elements in Map  
    Customer.put("M","M@gmail.com");    
  
        
    System.out.println("Customer Details: ");  
    for(Map.Entry m : Customer.entrySet()){    
     System.out.println("Name:" + m.getKey()+" Email:"+m.getValue());    
    }
    
    List<String> posts = new ArrayList<>();
    posts.add("POST 1");
    posts.add("POST 2");
    posts.add("POST 3");
    System.out.println("posts: ");
    for (String post: posts) {
        System.out.println(post);
    }
    Set<String> branches = new HashSet<>();
    branches.add("CSE");
    branches.add("ECE");
    branches.add("EEE");
    branches.add("ECE");

    for (String branch: branches) {
        System.out.println(branch);
    }
    }
    }
