/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author Kimy
 */
public class DeveloppeurExpert extends Developpeur {

    public DeveloppeurExpert(String nom, String prenom, int anciennete, String langage) {
        super(nom, prenom, anciennete, langage);
        this.poste = "developpeur expert"; 
    }

    @Override
    public int getSalaire() {
        return (int) Math.round(super.getSalaire() * 1.10);
    }
}
