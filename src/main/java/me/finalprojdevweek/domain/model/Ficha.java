package me.finalprojdevweek.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Ficha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String classe;
    private String guilda;
    
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public String getGuilda() {
        return guilda;
    }
    public void setGuilda(String guilda) {
        this.guilda = guilda;
    }

    @Override
    public String toString() {
        return "Ficha [id=" + id + ", classe=" + classe + ", guilda=" + guilda + "]";
    }

    
}
