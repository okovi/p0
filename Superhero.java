// Francisco Serrano 
// CS 1400 
// Assignment 5
// 11/13/21
public class Superhero extends Person { 
    // fields that are specific to the superhero class
    private String superHeroname; 
    private String superpower; 
    private String catchphrase; 
    private static int totalNumberVillansCaught; 
    // constructor for when you only know their superhero attrbutes
    public Superhero(String superHeroname, String superpower, String catchphrase) { 
        this.superHeroname=superHeroname; 
        this.superpower=superpower;
        this.catchphrase=catchphrase;
    }
    // constructor for when you know their personal identity and their superhero attributes
    public Superhero(String name, int age, String favfood,String superHeroname, String superpower, String catchphrase ) { 
        // using public methods in parent class to set private fields in child class inherited from the parent class
        setName(name); 
        setAge(age); 
        setFFood(favfood);
        // can directly set fields here since they are specific to this class
        this.superHeroname=superHeroname; 
        this.superpower=superpower;
        this.catchphrase=catchphrase;
    }
    // mimmic default constructor
    public Superhero() { 
        superHeroname=null; 
        superpower=null; 
        catchphrase=null;
    }
    // return all their attributes including the parent ones
    public String toString() { 
        String description= "Name: "+getName()+ "\nAge: "+getAge() + ". Favorite Food: "+ getFFood() + ". \nSuperhero name: "+ 
         superHeroname+ "\nSuperpower: "+ superpower+ ".\nCatchphrase: " + catchphrase;
        return description;
    }
    // additional set and getters
    public void setsuperHerohame(String superHeroname) { 
        this.superHeroname=superHeroname;
    }
    public String getName() { 
        return superHeroname; 
    }
    public void setPower(String superpower){ 
        this.superpower=superpower;
    }
    public String getPower(){ 
        return superpower;
    }
    public void setPhrase (String catchphrase) { 
        this.catchphrase=catchphrase;
    }
    public String getPhrase() { 
        return catchphrase;
    }
    public void catchVillain() { 
        totalNumberVillansCaught+=1;
    }
    public void villainsCaught() { 
        System.out.println("The total number of villains caught is: "+totalNumberVillansCaught);
    }
    public void speak() { 
        System.out.println("I'm " + superHeroname+".\n " +catchphrase+ "*swoooooosh*"); 
    }
}
