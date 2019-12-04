package com.endavacourse.filmpreference.model;

import javax.persistence.*;

@Entity
@Table(name = "genre_list", schema = "public", catalog = "postgres")
public class GenreList {
    private int idGenre;
    private String genreType;

    @Id
    @Column(name = "id_genre")
    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    @Basic
    @Column(name = "genre_type")
    public String getGenreType() {
        return genreType;
    }

    public void setGenreType(String genreType) {
        this.genreType = genreType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenreList genreList = (GenreList) o;

        if (idGenre != genreList.idGenre) return false;
        if (genreType != null ? !genreType.equals(genreList.genreType) : genreList.genreType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGenre;
        result = 31 * result + (genreType != null ? genreType.hashCode() : 0);
        return result;
    }
}
