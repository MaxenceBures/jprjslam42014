/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgVue;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pkgEntite.HibernateUtil;
import pkgEntite.Joueur;

/**
 *
 * @author Maxence
 */
public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Joueur unNouveauJoueur = new Joueur("ZZ");
        unNouveauJoueur.setJouNom("Test");
        Transaction tx = session.beginTransaction();
        /*session.save(unNouveauJoueur);
        tx.commit();*/
        //Recherche
        /*String sReq = "from Joueur where jou_code = 'zz'"; 
        Query q = session.createQuery(sReq);
        Joueur unJoueur = (Joueur) q.uniqueResult();
        System.out.println (unJoueur.getJouCode() +" - "+ unJoueur.getJouNom());*/
        // TODO code application logic here
        // gestion des erreurs
    /*String sReqe = "from Joueur where jou_code = 'ee'";
    Query qe = session.createQuery(sReqe);
    if (qe.uniqueResult()== null){
    System.out.println ("joueur inexistant"); }
    else {
    Joueur unJoueur = (Joueur) qe.uniqueResult();
    System.out.println (unJoueur.getJouNom());
    }
    List<Joueur> desJoueurs = qe.list();
    if (null != desJoueurs && desJoueurs.size() > 0) {
    unNouveauJoueur = desJoueurs.get(0);
    System.out.println (unNouveauJoueur.getJouNom()); }
    else {
    System.out.println ("joueur inexistant (liste vide)"); }*/
        // parcours des joueurs
    String sReqm = "from Joueur";
    Query qm = session.createQuery(sReqm); List<Joueur> lesJoueurs = qm.list();
    String sResultat ="";
    for(int i=0; i <lesJoueurs.size(); i++)
    {
    sResultat+=lesJoueurs.get(i).getJouNom()+ "\n"; }
    System.out.println(sResultat);
    Iterator joueur = qm.iterate();
    sResultat="";
    while (joueur.hasNext()){
    Joueur leJoueur = (Joueur) joueur.next();
    sResultat+=leJoueur.getJouNom()+"\n";
    } System.out.println(sResultat);
        } 
}
