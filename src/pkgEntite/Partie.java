package pkgEntite;
// Generated 19 mars 2014 20:54:55 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Partie generated by hbm2java
 */
public class Partie  implements java.io.Serializable {


     private int parNum;
     private Joueur joueur;
     private Date parDate;
     private int parBon;
     private int parMauvais;

    public Partie() {
    }

    public Partie(int parNum, Joueur joueur, Date parDate, int parBon, int parMauvais) {
       this.parNum = parNum;
       this.joueur = joueur;
       this.parDate = parDate;
       this.parBon = parBon;
       this.parMauvais = parMauvais;
    }
   
    public int getParNum() {
        return this.parNum;
    }
    
    public void setParNum(int parNum) {
        this.parNum = parNum;
    }
    public Joueur getJoueur() {
        return this.joueur;
    }
    
    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
    public Date getParDate() {
        return this.parDate;
    }
    
    public void setParDate(Date parDate) {
        this.parDate = parDate;
    }
    public int getParBon() {
        return this.parBon;
    }
    
    public void setParBon(int parBon) {
        this.parBon = parBon;
    }
    public int getParMauvais() {
        return this.parMauvais;
    }
    
    public void setParMauvais(int parMauvais) {
        this.parMauvais = parMauvais;
    }




}


