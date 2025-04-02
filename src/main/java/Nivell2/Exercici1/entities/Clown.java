package Nivell2.Exercici1.entities;

import Nivell2.Exercici1.json.JsonSerializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@JsonSerializer.JsonFile(path = "src/main/java/Nivell2/Exercici1/json/clown.json")
public class Clown {

    private String clownName;
    private String clownType;

    public Clown(String clownName, String clownType) throws IOException {
        this.clownName = clownName;
        this.clownType = clownType;
        validateJsonPath();
    }

    public void validateJsonPath() throws IOException {
        JsonSerializer.JsonFile annotation = this.getClass().getAnnotation(JsonSerializer.JsonFile.class);
        if (annotation != null ) {
            Path jsonPath = Paths.get(annotation.path());

            if (!Files.exists(jsonPath) || !Files.isRegularFile(jsonPath)) {
                throw new  IOException(jsonPath.toString() + " is not a valid JSON path");
            }
        }
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
