import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class User {
    private String name;
    private LinkedHashMap<Integer, Post> posts; // Kullanıcının gönderileri
    private HashSet<User> following; // Takip edilen kullanıcılar
    private TreeSet<Post> favorites; // Beğenilen Gönderiler

    public User(String name) {
        this.name = name;
        this.posts = new LinkedHashMap<>();
        this.following = new HashSet<>();
        this.favorites = new TreeSet<>();
    }

    public void follow(User user) {
        user.getFollowing().add(this);
        System.out.println(this.name + ", following the user " + user.getName() + ".");
    }

    public void createPost(String content) {
        Post newPost = new Post(this, content);
        posts.put(newPost.getId(), newPost);
        System.out.println(this.name + " posted: " + content);
    }

    public void addCommentToPost(Post post, String comment) {
        Comment newComment = new Comment(this, comment);
        post.addComment(newComment);
        System.out.println(this.name + ", commented to a post: " + post.getContent() + '-'+ comment);
    }

    public void addToFavorites(Post post) {
        if (post != null) {
            favorites.add(post);
            System.out.println(this.name + ", liked:" + post.getContent() );
        }
    }

    public LinkedHashMap<Integer, Post> getPosts() {
        return posts;
    }

    public HashSet<User> getFollowing() {
        return following;
    }

    public TreeSet<Post> getFavorites() {
        return favorites;
    }

    public String getName() {
        return name;
    }

    public void showFeed() {
        System.out.println("\n" + name + "'s feed:");
        for (User user : following) {
            user.showPosts();
        }
    }

    public void showPosts() {
        for (Post post : posts.values()) {
            System.out.println(post.getContent());
            for (Comment comment : post.getComments()) {
                System.out.println(" - " + comment.getUser().getName() + ": " + comment.getContent());
            }
        }
    }
}
