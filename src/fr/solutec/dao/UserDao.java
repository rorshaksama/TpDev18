
package fr.solutec.dao;

import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao {
    
    public static User getByLoginAndPass(String log,String mdp)throws SQLException{
        
        User u = null;
        
        String sql = "SELECT * FROM person WHERE login =? AND mdp =?";
        
        Connection connexion = AccessBd.getConnection();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1,log);
        requete.setString(2,mdp);

        ResultSet rs=requete.executeQuery();
        
        if(rs.next()){
            u = new User();
           // u.setId(rs.getInt("idperson"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setLogin(rs.getString("login"));
            u.setMdp(rs.getString("mdp"));
            u.setSexe(rs.getBoolean("sexe"));
           // u.setLastCo(rs.getDate("Dernière connexion"));
            u.setPoids(rs.getDouble("poids"));
            u.setTaille(rs.getInt("taille"));
            u.setAge(rs.getInt("age"));
            
           //  Variables.currentUser= result;         
        }
        
        return u;
    }

public static void inscription (User person) throws SQLException{
    String sql = "INSERT INTO person(nom,prenom,mail,login,mdp,sexe) VALUES(?,?,?,?,?,1)";
        
        Connection connexion = AccessBd.getConnection();
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1,person.getNom());
        requete.setString(2, person.getPrenom());
        requete.setString(3, person.getLogin());
        requete.setString(4, person.getMdp());
        requete.setBoolean(5, person.getSexe());
//        requete.setDouble(5,person.getPoids());
//        requete.setDouble(6,person.getTaille());
//        requete.setInt(7,person.getAge());
        
        requete.execute();
    }

//       public static void insertObjectifPoidsSemaine(DonneesSemaine donneesSemaine)throws SQLException{
//        
//            /*
//                    this.objectifRealise = objectifRealise;
//        this.categorie = categorie;
//        this.date = date;
//        this.valeur = valeur;
//        this.idUser = idUser;
//            */
//            
//        String sql = "INSERT INTO DonneesSemaine(objectifRealise,categorie,semaine,valeur,idUser) VALUE (?, ?, ?, ?,?)";
//        Connection connexion = AccessBD.getConnection();
//        
//        PreparedStatement requete = connexion.prepareStatement(sql);
//        
//        requete.setBoolean(1, donneesSemaine.isObjectifRealise());
//        requete.setString(2, donneesSemaine.getCategorie());
//        requete.setInt (3, donneesSemaine.getSemaine());
//        requete.setDouble(4, donneesSemaine.getValeur());
//        requete.setInt(5, donneesSemaine.getIdUser());
//        
//        requete.execute();
//
//    }






}
    
    
    
    
    

