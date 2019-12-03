package hu.unideb.inf.web.model;

import javax.persistence.*;

@Entity
public class Repter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repterkod")
    private String repterkod;

    @Column(name = "repternev")
    private String repternev;

    @Column(name = "helyszin")
    private String helyszin;

    public String getRepterkod() {
        return repterkod;
    }

    public void setRepterkod(String repterkod) {
        this.repterkod = repterkod;
    }

    public String getRepternev() {
        return repternev;
    }

    public void setRepternev(String repternev) {
        this.repternev = repternev;
    }

    public String getHelyszin() {
        return helyszin;
    }

    public void setHelyszin(String helyszin) {
        this.helyszin = helyszin;
    }
}
