
package fr.solutec.model;


public class User {
    
    private int Id;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private String mail;
    private double poids;
    private double taille;
    private int age;
    private int sexe;

    public User() {
    }

    public User(int Id, String nom, String prenom, String login, String mdp, String mail, double poids, double taille, int age, int sexe) {
        this.Id = Id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.mdp = mdp;
        this.mail = mail;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return "User{" + "Id=" + Id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", mdp=" + mdp + ", mail=" + mail + ", poids=" + poids + ", taille=" + taille + ", age=" + age + ", sexe=" + sexe + '}';
    }

    public void setId(int Id) {
        this.Id = Id;
    }

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

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public int getId() {
        return Id;
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

    public int getSexe() {
        return sexe;
    }

}