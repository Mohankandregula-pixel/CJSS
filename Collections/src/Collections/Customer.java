package Collections;
import java.util.*;

public class Customer {
    private String name;
    private String email;
    private List<Posts> posts;

    public Customer(String name, String email, List<Posts> posts) {
        this.name = name;
        this.email = email;
        this.posts = posts;
    }

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", posts=" + posts +
                '}';
    }
}
