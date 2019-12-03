package hu.unideb.inf.web.model;

import javax.persistence.*;

@Entity
public class Jarat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jaratszam")
    private String jaratszam;

    @Column(name = "legitarsasag_kod")
    private String legitarsasagKod;

    @Column(name = "indulasi_repter")
    private String indulasiRepter;

    @Column(name = "erkezesi_repter")
    private String erkezesiRepter;

    @Column(name = "indulasi_ido")
    private String indulasiIdo;

    @Column(name = "erkezesi_ido")
    private String erkezesiIdo;

    public String getJaratszam() {
        return jaratszam;
    }

    public void setJaratszam(String jaratszam) {
        this.jaratszam = jaratszam;
    }

    public String getLegitarsasagKod() {
        return legitarsasagKod;
    }

    public void setLegitarsasagKod(String legitarsasagKod) {
        this.legitarsasagKod = legitarsasagKod;
    }

    public String getIndulasiRepter() {
        return indulasiRepter;
    }

    public void setIndulasiRepter(String indulasiRepter) {
        this.indulasiRepter = indulasiRepter;
    }

    public String getErkezesiRepter() {
        return erkezesiRepter;
    }

    public void setErkezesiRepter(String erkezesiRepter) {
        this.erkezesiRepter = erkezesiRepter;
    }

    public String getIndulasiIdo() {
        return indulasiIdo;
    }

    public void setIndulasiIdo(String indulasiIdo) {
        this.indulasiIdo = indulasiIdo;
    }

    public String getErkezesiIdo() {
        return erkezesiIdo;
    }

    public void setErkezesiIdo(String erkezesiIdo) {
        this.erkezesiIdo = erkezesiIdo;
    }
}
