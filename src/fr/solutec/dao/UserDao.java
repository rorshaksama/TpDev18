
package fr.solutec.dao;

import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import fr.solutec.ihm.FnHome;
import static fr.solutec.ihm.FnHome.capte;


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
    String sql = "INSERT INTO person(nom,prenom,mail,login,mdp,sexe) VALUES(?,?,?,?,?,?)";
        
        Connection connexion = AccessBd.getConnection();
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1,person.getNom());
        requete.setString(2, person.getPrenom());
        requete.setString(3, person.getMail());
        requete.setString(4, person.getLogin());
        requete.setString(5, person.getMdp());
        requete.setBoolean(6, person.getSexe());
//        requete.setDouble(5,person.getPoids());
//        requete.setDouble(6,person.getTaille());
//        requete.setInt(7,person.getAge());
        
        requete.execute();
    }



public static List<User> getAllPerson() throws SQLException{
    List<User> users=new ArrayList<>();
    String sql="select * from histopoids h inner join person p on h.idPerson=p.idPerson where p.login = ? ";
    String test=capte.getLogin();          
    Connection connexion = AccessBd.getConnection();
    PreparedStatement requete=connexion.prepareStatement(sql);    
    requete.setString(1,test);
    ResultSet rs=requete.executeQuery();       
    while (rs.next()){
        User u=new User();
        u=new User();
        u.setId(rs.getInt("idhp"));
        u.setPoids(rs.getInt("poids"));
        users.add(u);
    }return users;
}




}
    
    
    
    
    

