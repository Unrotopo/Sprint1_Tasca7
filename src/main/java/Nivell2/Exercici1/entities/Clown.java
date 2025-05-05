package Nivell2.Exercici1.entities;

import Nivell2.Exercici1.json.JsonSerializer;
import Nivell2.Exercici1.json.JsonSerializer.JsonFile;

import java.io.IOException;

@JsonFile(path = "src/main/java/Nivell2/Exercici1/json/clown.json")
public class Clown {

    private String clownName;
    private String clownType;

    public Clown(String clownName, String clownType) throws IOException {
        this.clownName = clownName;
        this.clownType = clownType;
        JsonSerializer.validateJsonPath(this);
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
}
