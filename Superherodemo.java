// Francisco Serrano 
// CS 1400 
// Assignment 5
// 11/13/21

public class Superherodemo {
    public static void main(String[] args) { 
        // instantiating the superhero objects with attributes from person class and superhero class
        Superhero spiderman= new Superhero ("Peter Parker" , 18, "Cherry Pie","Spiderman", 
        "Superhuman", "With great power comes great responsibility");
        Superhero ironman= new Superhero ("Tony Stark ", 48, "Burgers", "Ironman", 
        " Powered armored suit", "The suit and I are one."); 
        // instantiating two person objects
        Person mj= new Person (" Mary Jane", 19, "Spaghetti"); 
        Person may= new Person(" Aunt May", 42,"Lasagna"); 
        // printing out each one but adding a line of *** to help with readability 
        System.out.println(spiderman.toString()); 
        System.out.println("**********************");
        System.out.println(ironman.toString()); 
        System.out.println("**********************");
        System.out.println(mj.toString()); 
        System.out.println("**********************");
        System.out.println(may.toString()); 
        System.out.println("**********************");
        // increasing villain caught by each superhero then printing out how many have been caught by all super heros so far
        spiderman.catchVillain();
        spiderman.villainsCaught();
        ironman.catchVillain();
        ironman.villainsCaught();
        // comparing my two super heros 
        if (spiderman.equals(ironman)) { 
            System.out.println("They are the same hero!"); 

        } else { 
            System.out.println("They are not the same hero");
        }
        // comparing my two objects from the super hero class
        if (mj.equals(may)) { 
            System.out.println("They are the same person!");

        } else { 
            System.out.println("They are not the same person!");
        }
        // calling each one's speak methods
        spiderman.speak();
        ironman.speak();
    }
}
