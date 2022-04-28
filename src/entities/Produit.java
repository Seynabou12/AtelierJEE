package entities;

public class Produit {

    public int idP;
    public String nomProduit;
    public String codeProduit;
    public String descriptionP;
    public String prix;
    public String dateCreation;
    public String dateExpiration;

    public Produit()
    {
        super();
    }

    public Produit(int idP, String nomProduit,String codeProduit, String descriptionP, String prix, String dateCreation, String dateExpiration) {
        this.idP = idP;
        this.nomProduit = nomProduit;

        this.codeProduit = codeProduit;
        this.descriptionP = descriptionP;
        this.prix = prix;
        this.dateCreation = dateCreation;
        this.dateExpiration = dateExpiration;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getDescriptionP() {
        return descriptionP;
    }

    public void setDescriptionP(String descriptionP) {
        this.descriptionP = descriptionP;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

}
