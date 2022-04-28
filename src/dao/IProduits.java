package dao;

import entities.Produit;

import java.util.List;

public interface IProduits {

    public int create(Produit produit);
    public List<Produit> read();
    public int update(Produit produit);
    public int delete(int idP);

}
