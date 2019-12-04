package com.endavacourse.filmpreference.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mpaa {
    private int idMpaa;
    private String typeMpaa;

    @Id
    @Column(name = "id_mpaa")
    public int getIdMpaa() {
        return idMpaa;
    }

    public void setIdMpaa(int idMpaa) {
        this.idMpaa = idMpaa;
    }

    @Basic
    @Column(name = "type_mpaa")
    public String getTypeMpaa() {
        return typeMpaa;
    }

    public void setTypeMpaa(String typeMpaa) {
        this.typeMpaa = typeMpaa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mpaa mpaa = (Mpaa) o;

        if (idMpaa != mpaa.idMpaa) return false;
        if (typeMpaa != null ? !typeMpaa.equals(mpaa.typeMpaa) : mpaa.typeMpaa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMpaa;
        result = 31 * result + (typeMpaa != null ? typeMpaa.hashCode() : 0);
        return result;
    }
}
