package com.endavacourse.filmpreference.model;

import javax.persistence.*;

@Entity
@Table(name = "moovie_viewed", schema = "public", catalog = "postgres")
public class MoovieViewed {
    private int idView;
    private boolean viewed;

    @Id
    @Column(name = "id_view")
    public int getIdView() {
        return idView;
    }

    public void setIdView(int idView) {
        this.idView = idView;
    }

    @Basic
    @Column(name = "viewed")
    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoovieViewed that = (MoovieViewed) o;

        if (idView != that.idView) return false;
        if (viewed != that.viewed) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idView;
        result = 31 * result + (viewed ? 1 : 0);
        return result;
    }
}
