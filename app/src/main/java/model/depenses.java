package model;

import com.google.gson.annotations.SerializedName;





public class depenses {

    private int iddep;

    @SerializedName("type")
    private String type;

    @SerializedName("description")
    private String description;

    @SerializedName("montant")
    private float montant;

    @SerializedName("datedepaiement")
    private String datedepaiement;

    public int getIddep() {
        return iddep;
    }

    public void setIddep(int iddep) {
        this.iddep = iddep;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getDatedepaiement() {
        return datedepaiement;
    }

    public void setDatedepaiement(String datedepaiement) {
        this.datedepaiement = datedepaiement;
    }
}
