package com.endavacourse.filmpreference.model;

import javax.persistence.*;

@Entity
@Table(name = "moovie_list", schema = "public", catalog = "postgres")
public class MoovieList {
    private int idMoovie;
    private String name;
    private int yearRelease;
    private Float rating;

    @Id
    @Column(name = "id_moovie")
    public int getIdMoovie() {
        return idMoovie;
    }

    public void setIdMoovie(int idMoovie) {
        this.idMoovie = idMoovie;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "year_release")
    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Basic
    @Column(name = "rating")
    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoovieList that = (MoovieList) o;

        if (idMoovie != that.idMoovie) return false;
        if (yearRelease != that.yearRelease) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMoovie;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + yearRelease;
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }
}
