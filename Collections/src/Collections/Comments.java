package Collections;

public class Comments {

    //        Comments - This will have details of comments given for each post
//        postId - For which post comment should be added
//        email - Who are giving comment
//        comment - message of comment

    private String postId;
    private String email;
    private String comment;

    public Comments(String postId, String email, String comment) {
        this.postId = postId;
        this.email = email;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "postId='" + postId + '\'' +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
