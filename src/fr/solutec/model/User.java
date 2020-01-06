
package fr.solutec.model;

import java.sql.Date;


public class User {
    
    private int Id;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private String mail;
    private double poids;
    private int taille;
    private int age;
    private boolean sexe;
    private Date lastCo;

    public User() {
    }

//    public User( String nom, String prenom, String login, String mdp, String mail, double poids, int taille, int age, boolean sexe, Date lastCo) {
//        //this.Id = Id;
//        this.nom = nom;
//        this.prenom = prenom;
//        this.login = login;
//        this.mdp = mdp;
//        this.mail = mail;
//        this.poids = poids;
//        this.taille = taille;
//        this.age = age;
//        this.sexe = sexe;
//        this.lastCo = lastCo;
//    }

    public User(String nom, String prenom, String login, String mdp,String mail, boolean sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.mdp = mdp;
        this.sexe=sexe;
        this.mail=mail;
    }

        
    @Override
    public String toString() {
        return "User{, nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", mdp=" + mdp + ", mail=" + mail + ", poids=" + poids + ", taille=" + taille + ", age=" + age + ", sexe=" + sexe + '}';
    }

    public void setId(int Id) {
        this.Id = Id;    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

 
    

    public void setAge(int age) {
        this.age = age;
    }

    
    public int getId() {
        return Id;
    }
    public boolean getSexe() {
        return sexe;
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public String getMail() {
        return mail;
    }

    public double getPoids() {
        return poids;
    }

    public double getTaille() {
        return taille;
    }

    public int getAge() {
        return age;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }

    public void setLastCo(Date lastCo) {
        this.lastCo = lastCo;
    }


}