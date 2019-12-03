package hu.unideb.inf.web.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Repulojegy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="jegy")
    private String jegy;

    @Column(name = "utas_azon")
    private Long utasAzon;

    @Column(name = "utazasi_osztaly")
    private String utazasiOsztaly;

    @Column(name="datum")
    private Date datum;

    public String getJegy() {
        return jegy;
    }

    public void setJegy(String jegy) {
        this.jegy = jegy;
    }

    public Long getUtasAzon() {
        return utasAzon;
    }

    public void setUtasAzon(Long utasAzon) {
        this.utasAzon = utasAzon;
    }

    public String getUtazasiOsztaly() {
        return utazasiOsztaly;
    }

    public void setUtazasiOsztaly(String utazasiOsztaly) {
        this.utazasiOsztaly = utazasiOsztaly;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
}
