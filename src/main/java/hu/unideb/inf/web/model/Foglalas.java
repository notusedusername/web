package hu.unideb.inf.web.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "foglalas")
@IdClass(FoglalasId.class)
public class Foglalas {
    @Id
    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "jegy", referencedColumnName = "jegy")
    private Repulojegy jegy;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jaratszam", referencedColumnName = "jaratszam")
    private Jarat jarat;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "indulasi_ido", referencedColumnName = "indulasi_ido")
    private Date indulasiIdo;

    public Jarat getJarat() {
        return jarat;
    }

    public void setJarat(Jarat jarat) {
        this.jarat = jarat;
    }

    public Repulojegy getJegy() {
        return jegy;
    }

    public void setJegy(Repulojegy jegy) {
        this.jegy = jegy;
    }


    public Date getIndulasiIdo() {
        return indulasiIdo;
    }

    public void setIndulasiIdo(Date indulasiIdo) {
        this.indulasiIdo = indulasiIdo;
    }
}
