// Francsico Serrano 
// CS 1400 
// Assignment 5
// 11/13/21

public class Person {
    // fields to holds their info 
    private String name; 
    private int age; 
    private String favfood; 
    public Person(String name, int age, String favfood)  {
        this.name=name; 
        this.age=age; 
        this.favfood=favfood; 
    }
    // this is my copy constructor 
    public Person(Person modelPerson) {
        name=modelPerson.getName();
        age=modelPerson.getAge();
        favfood=modelPerson.getFFood();
    }
    public Person() { 
        this.name=null;
        this.age=0;
        this.favfood=null; 
    }
    // standard setters and getters below for my fields
    public void setName(String name) { 
        this.name=name; 
    }
    public String getName() { 
        return name; 
    }
    public void setAge(int age){ 
        this.age=age; 
    }
    public int getAge() { 
        return age; 
    }
    public void setFFood(String favfood) { 
        this.favfood=favfood;
    }
    public String getFFood(){ 
        return favfood;
    }
    // next in my if statement i will ask if my string equals the other name string 
    // i have to create my own equals class to compare objects of classes i create
    public boolean equals(Person other){ 
        boolean status=false; // assuming they are not equal
        // next line changes assumption if they are equal 
        if (name.equals(other.name) && age==other.age && favfood.equals(other.favfood) ) { 
            status=true;
        }
        return status; // returns end result after execution 
    }
    public String toString(){ 
    String description = "Name:"+ name+" \nAge: " +age +". Favorite food: " +favfood;
    return description;
    }




    
}
