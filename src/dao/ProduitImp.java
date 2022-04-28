package dao;

import entities.Produit;

import java.sql.ResultSet;
import java.util.List;

public class ProduitImp implements IProduits
{

    private DB db = new DB();
    private int ok;
    private ResultSet rs;

    @Override
    public int create(Produit produit) {

        String sql = "INSERT INTO produit VALUES(NULL, ?, ?, ?, ?, ?, ?)";

        try {

            // initialisation de la requete
            db.initPrepar(sql);
            db.getPstm().setString(1, produit.getNomProduit());
            db.getPstm().setString(2, produit.getCodeProduit());
            db.getPstm().setString(3, produit.getDescriptionP());
            db.getPstm().setString(4, produit.getPrix());
            db.getPstm().setString(5, produit.getDateCreation());
            db.getPstm().setString(6, produit.getDateExpiration());

            ok = db.executeMaj();
            db.closeConnection();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<Produit> read() {
        return null;
    }

    @Override
    public int update(Produit produit) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
