public class Animal {
    public String name;
    public String breed;
    public Boolean isDosmetic;
    Animal(String name, String breed, Boolean isDosmetic){
        this.name = name;
        this.breed = breed;
        this.isDosmetic = isDosmetic;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String somename){
        this.name = somename;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String someBreed){
        this.breed = someBreed;
    }

    public boolean getIsDomestic(){
        return this.isDosmetic;
    }

    public void setIsDomestic(Boolean isDomeesticAnimal){
        this.isDosmetic = isDomeesticAnimal;
    }
}
