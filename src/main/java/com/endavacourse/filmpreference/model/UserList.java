package com.endavacourse.filmpreference.model;

import javax.persistence.*;

@Entity
@Table(name = "user_list", schema = "public", catalog = "postgres")
public class UserList {
    private int idUser;
    private String nickname;
    private String eMail;
    private String password;
    private Integer age;

    @Id
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "e_mail")
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserList userList = (UserList) o;

        if (idUser != userList.idUser) return false;
        if (nickname != null ? !nickname.equals(userList.nickname) : userList.nickname != null) return false;
        if (eMail != null ? !eMail.equals(userList.eMail) : userList.eMail != null) return false;
        if (password != null ? !password.equals(userList.password) : userList.password != null) return false;
        if (age != null ? !age.equals(userList.age) : userList.age != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
