package hu.unideb.inf.web.model;

import javax.persistence.*;

@Entity
@Table(name = "utas")
public class Utas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "utas_azon")
    private Long utas_azon;

    @Column(name = "vnev")
    private String vezeteknev;

    @Column(name = "knev")
    private String keresztnev;

    @Column(name = "telefon")
    private String telefon;

    @Column(name = "email")
    private String email;

    @Column(name = "lakcim")
    private String lakcim;

    public Long getUtas_azon() {
        return utas_azon;
    }

    public void setUtas_azon(Long utas_azon) {
        this.utas_azon = utas_azon;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLakcim() {
        return lakcim;
    }

    public void setLakcim(String lakcim) {
        this.lakcim = lakcim;
    }
}
