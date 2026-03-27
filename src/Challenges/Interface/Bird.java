package Challenges.Interface;

public abstract class Bird implements Flayable{

    private final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
