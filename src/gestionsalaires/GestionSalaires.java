/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionsalaires;
import java.util.ArrayList;

/**
 *
 * @author maxim
 */
public class GestionSalaires {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Employe> equipe = new ArrayList<>();
        equipe.add(new Developpeur("Durand", "Michel", 4, "java"));
        equipe.add(new Manager("Dupont", "Lucie", 2));
        equipe.add(new Administratif("Martin", "Paul", 3));
        equipe.add(new DeveloppeurExpert("Leroy", "Sophie", 6, "python"));
        
        for (Employe e : equipe) {
            System.out.println(e.getDescription());
        }
    }
    
}