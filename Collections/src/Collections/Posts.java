package Collections;
import java.util.List;
public class Posts {
//        postId
//        email (Customer email)
//        heading
//        description
    private String postId;
    private String email;
    private String heading;
    private String description;
    private List<Comments> Comments;

    public Posts(String postId, String email, String heading, String description, List<Collections.Comments> comments) {
        this.postId = postId;
        this.email = email;
        this.heading = heading;
        this.description = description;
        Comments = comments;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Collections.Comments> getComments() {
        return Comments;
    }

    public void setComments(List<Collections.Comments> comments) {
        Comments = comments;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "postId='" + postId + '\'' +
                ", email='" + email + '\'' +
                ", heading='" + heading + '\'' +
                ", description='" + description + '\'' +
                ", Comments=" + Comments +
                '}';
    }
}
