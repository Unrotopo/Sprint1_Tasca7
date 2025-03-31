package Nivell3.Exercici1.entities;

import Nivell3.Exercici1.json.JsonSerializer;

@JsonSerializer.JsonFile(path = "src/main/java/Nivell3/Exercici1/json/clown.json")
public class Clown {

    private String clownName;
    private String clownType;
    static final int clownCarSeats = 20;

    public Clown(String clownName, String clownType) {
        this.clownName = clownName;
        this.clownType = clownType;
    }

    public String getClownName() {
        return clownName;
    }

    public void setClownName(String clownName) {
        this.clownName = clownName;
    }

    public String getClownType() {
        return clownType;
    }

    public void setClownType(String clownType) {
        this.clownType = clownType;
    }

    public String getClownCarSeats() {
        return clownCarSeats + " clowns fit in his car";
    }

}
