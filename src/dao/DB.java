package dao;
import java.sql.*;

public class DB

{
    //objet pour la connexion
    private Connection cnx;
    //objet pour contenir les résultats des requetes préparées
    private PreparedStatement pstm;
    //objet variable pour contenir les résultats des requetes de type select
    private ResultSet rs;
    // pour les resultats de la requéte type mise à jour (update delete
    private int ok;


    // Ouvrir la Connection à la base

    public  void getConnection()

    {
        String url = "jdbc:mysql://localhost:3306/atelierJEE";
        String user = "root";
        String password = "";

        try
        {
            // forName accéde à la classe driver
            Class.forName("com.mysql.jdbc.Driver"); //ajout de l'API jdbc dans l'application
            // Ouvir la connexion à la base
            cnx = DriverManager.getConnection(url,user,password);
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    // method init prépare permet d'initialiser pour préparer la requete
    public void initPrepar(String sql)
    {
        try
        {
            //Ouverture de la Connexion
            getConnection();

            // Initialiser l'exécution de la requéte
            pstm = cnx.prepareStatement(sql);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    // exécution des requetes de type selecte

    public ResultSet executeSelect()
    {
        try {
            rs = pstm.executeQuery();

        }catch (Exception ex){

            ex.printStackTrace();
        }
        return rs;
    }

    //permet d'exécuter les requete de type Update

    public  int executeMaj()
    {
        try {
            ok = pstm.executeUpdate();

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return ok;
    }

    // fonction qui permet de fermer la connection à la base donnée

    public void closeConnection()
    {
        try {
            cnx.close();
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    // fonction nous permet de passer des valeurs avant de l'exécuter et pstm doit etre visible à distance

    public PreparedStatement getPstm()
    {
        return pstm;
    }
}
