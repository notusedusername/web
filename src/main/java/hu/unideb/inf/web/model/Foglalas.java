package hu.unideb.inf.web.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "foglalas")
@IdClass(FoglalasId.class)
public class Foglalas {
    @Id
    @Column(name="jegy")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "repulojegy_jegy", referencedColumnName = "jegy")
    private Repulojegy jegy;

    @Id
    @Column(name="jaratszam")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jarat_jaratszam", referencedColumnName = "jaratszam")
    private Jarat jarat;

    @Id
    @Column(name="indulasi_ido")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jarat_indulasi_ido", referencedColumnName = "indulasi_ido")
    private Date indulasiIdo;

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
