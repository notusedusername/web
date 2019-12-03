package hu.unideb.inf.web.model;

import java.sql.Date;

public class FoglalasId {

    private Repulojegy jegy;

    private Jarat jarat;

    private Date indulasiIdo;

    public FoglalasId(Repulojegy jegy, Jarat jarat, Date indulasiIdo) {
        this.jegy = jegy;
        this.jarat = jarat;
        this.indulasiIdo = indulasiIdo;
    }
}
