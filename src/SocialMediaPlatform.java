public class SocialMediaPlatform {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Kullanıcılar birbirini takip ediyor
        user1.follow(user2);

        // Gönderiler oluşturuluyor
        user1.createPost("Hello, this is my first post!");
        user2.createPost("Hello, everyone!");

        // Yorum oluşturuluyor ve ekleniyor
        user2.addCommentToPost(user1.getPosts().get(0), "Nice post, Alice!");

        // Favorilere ekleme
        Post postToFavorite = user2.getPosts().get(1);
        if (postToFavorite != null) {
            user1.addToFavorites(postToFavorite);
        } else {
            System.out.println("The post you try to add your favorites can not be found.");
        }

        // Kullanıcıların ana sayfası gösteriliyor
        user1.showFeed();
        user2.showFeed();
    }
}
