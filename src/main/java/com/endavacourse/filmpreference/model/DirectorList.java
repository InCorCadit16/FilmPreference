package com.endavacourse.filmpreference.model;

import javax.persistence.*;

@Entity
@Table(name = "director_list", schema = "public", catalog = "postgres")
public class DirectorList {
    private int idDirector;
    private String name;

    @Id
    @Column(name = "id_director")
    public int getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectorList that = (DirectorList) o;

        if (idDirector != that.idDirector) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDirector;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
