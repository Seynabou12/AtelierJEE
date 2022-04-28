package entities;

public class Categories {

    public String idCategorie;
    public String nomCategorie;
    public String descriptionC;

    public Categories() {
        super();
    }

    public Categories(String idCategorie, String nomCategorie, String descriptionC) {
        this.idCategorie = idCategorie;
        this.nomCategorie = nomCategorie;
        this.descriptionC = descriptionC;
    }

    public String getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(String idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getDescriptionC() {
        return descriptionC;
    }

    public void setDescriptionC(String descriptionC) {
        this.descriptionC = descriptionC;
    }
}
