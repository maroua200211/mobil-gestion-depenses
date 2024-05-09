package model;



public class Utilisateurs {

    private int iduser;


    private String nom;


    private String prenom;


    private String email;


    private float soldeac;


    private String dtn;


    private String motDepasse;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSoldeac() {
        return soldeac;
    }

    public void setSoldeac(float soldeac) {
        this.soldeac = soldeac;
    }

    public String getDtn() {
        return dtn;
    }

    public void setDtn(String dtn) {
        this.dtn = dtn;
    }

    public String getMotDepasse() {
        return motDepasse;
    }

    public void setMotDepasse(String motDepasse) {
        this.motDepasse = motDepasse;
    }
}
