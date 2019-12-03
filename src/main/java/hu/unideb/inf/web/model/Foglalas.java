package hu.unideb.inf.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Date;

@Entity
public class Foglalas {

    @Column(name="jegy")
    private String jegy;

    @Column(name="jaratszam")
    private String jaratSzam;

    @Column(name="indulasi_ido")
    private Date indulasiIdo;

    public String getJegy() {
        return jegy;
    }

    public void setJegy(String jegy) {
        this.jegy = jegy;
    }

    public String getJaratSzam() {
        return jaratSzam;
    }

    public void setJaratSzam(String jaratSzam) {
        this.jaratSzam = jaratSzam;
    }

    public Date getIndulasiIdo() {
        return indulasiIdo;
    }

    public void setIndulasiIdo(Date indulasiIdo) {
        this.indulasiIdo = indulasiIdo;
    }
}
