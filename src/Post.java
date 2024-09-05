import java.util.ArrayList;
import java.util.List;

public class Post implements Comparable<Post> {
    private static int postCounter = 0;
    private int id;
    private User user;
    private String content;
    private List<Comment> comments;

    public Post(User user, String content) {
        this.id = postCounter++;
        this.user = user;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public int compareTo(Post other) {
        return Integer.compare(this.id, other.id);
    }
}
