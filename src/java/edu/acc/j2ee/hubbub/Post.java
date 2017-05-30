package edu.acc.j2ee.hubbub;

import java.time.LocalDateTime;

public class Post implements java.io.Serializable {
    private User author;
    private String content;
    private LocalDateTime posted;

    public Post() {
    }

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.posted = LocalDateTime.now();
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPosted() {
        return posted;
    }

    public void setPosted(LocalDateTime posted) {
        this.posted = posted;
    }

    @Override
    public String toString() {
        return "Post{" + "author=" + author + ", content=" + content +
                ", timestamp=" + posted + '}';
    }
    
    
}
