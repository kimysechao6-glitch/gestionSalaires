/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Developpeur extends Employe {

    private String langage;

    public Developpeur(String nom, String prenom, int anciennete, String langage) {
        super(nom, prenom, anciennete, "developpeur");
        this.langage = langage;
    }

    private int getPrimeLangage() {
        switch (langage.toLowerCase()) {
            case "java":   return 50;
            case "python": return 70;
            case "php":    return 45;
            default:       return 0; // autres langages : pas de prime
        }
    }

    @Override
    public int getSalaire() {
        return 1900 + anciennete * 100 + getPrimeLangage();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Il est spécialisé en " + langage + ".";
    }
}