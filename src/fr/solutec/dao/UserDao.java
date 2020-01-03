
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
    }}
    
    
    
    
    

