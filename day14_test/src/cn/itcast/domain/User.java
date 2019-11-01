package cn.itcast.domain;

/**
 * 用户实体类
 * @author: xie
 * @create: 2019-11-01 11:31
 **/
public class User {
    private int id;
    private String username;
    private String passwd;

    public User() {
    }

    public User(int id, String username, String passwd) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
