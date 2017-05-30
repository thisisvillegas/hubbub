package edu.acc.j2ee.hubbub;

public interface Dao {
    public boolean addUser(User u);
    public boolean addPost(Post p);
    public User findUserByUsername(String username);
    public void close();
}
