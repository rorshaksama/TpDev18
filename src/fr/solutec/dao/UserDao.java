
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
            u.setId(rs.getInt("idperson"));
            u.setNom(rs.getString("nom"));
            u.setNom(rs.getString("prenom"));
            u.setNom(rs.getString("login"));
                      
        }
        
        return u;
    }

public static void inscription (User person) throws SQLException{
    String sql = "INSERT INTO person(nom,prenom,mail,login,mdp,poids,taille,age) VALUES(?,?,?,?,?,?)";
        
        Connection connexion = AccessBd.getConnection();
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1,person.getNom());
        requete.setString(2, person.getPrenom());
        requete.setString(3, person.getLogin());
        requete.setString(4, person.getMdp());
        requete.setDouble(5,person.getPoids());
        requete.setDouble(6,person.getTaille());
        requete.setInt(1,person.getAge());
        
        requete.execute();
    }








}
    
    
    
    
    

