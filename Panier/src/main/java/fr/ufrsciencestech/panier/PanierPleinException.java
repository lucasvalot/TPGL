package fr.ufrsciencestech.panier;

public class PanierPleinException extends Exception {
    
    public PanierPleinException()
    {
	super("Ajout impossible car le panier est plein !");
    }

}