package com.endavacourse.filmpreference.model;

import javax.persistence.*;

@Entity
@Table(name = "actor_list", schema = "public", catalog = "postgres")
public class ActorList {
    private int idActor;
    private String name;

    @Id
    @Column(name = "id_actor")
    public int getIdActor() {
        return idActor;
    }

    public void setIdActor(int idActor) {
        this.idActor = idActor;
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

        ActorList actorList = (ActorList) o;

        if (idActor != actorList.idActor) return false;
        if (name != null ? !name.equals(actorList.name) : actorList.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idActor;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
