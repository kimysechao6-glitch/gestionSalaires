/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;
import java.util.ArrayList;
/**
 *
 * @author Kimy
 */
public class Service {
    private ArrayList<Employe> Employe = new ArrayList<Employe>();

    public void AjouterEmploye(Employe e){
        this.Employe.add(e);
    }
    public void ListerEmployes(){
        for (Employe e : Employe){
            System.out.println("\n### " + e.prenom + " " + e.nom + " ###");
            System.out.println(e.getDescription());
            System.out.println(e.getSalaire());
        }
    }
}