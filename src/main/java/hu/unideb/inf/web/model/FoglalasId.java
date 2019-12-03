package hu.unideb.inf.web.model;

import java.sql.Date;

public class FoglalasId {

    private Repulojegy jegy;

    private String jaratSzam;

    private Date indulasiIdo;

    public FoglalasId(Repulojegy jegy, String jaratSzam, Date indulasiIdo) {
        this.jegy = jegy;
        this.jaratSzam = jaratSzam;
        this.indulasiIdo = indulasiIdo;
    }
}
