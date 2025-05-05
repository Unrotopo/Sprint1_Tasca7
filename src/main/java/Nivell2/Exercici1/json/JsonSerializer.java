package Nivell2.Exercici1.json;

import Nivell2.Exercici1.entities.Clown;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializer {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface JsonFile {
        String path();
    }

    public static void serialize(Clown clown) throws IOException {
        Class<? extends Clown> clazz = clown.getClass();

        if (clazz.isAnnotationPresent(JsonFile.class)) {
            JsonFile annotation = clazz.getAnnotation(JsonFile.class);
            String filePath = annotation.path();

            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), clown);

            System.out.println("JSON saved to " + filePath);
        } else {
            System.out.println("No @JsonFile annotation found");
        }
    }

    public static void validateJsonPath(Clown clown) throws IOException {
        JsonFile annotation = clown.getClass().getAnnotation(JsonFile.class);
        if (annotation != null ) {
            Path jsonPath = Paths.get(annotation.path());

            if (!Files.exists(jsonPath) || !Files.isRegularFile(jsonPath)) {
                throw new  IOException(jsonPath.toString() + " is not a valid JSON path");
            }
        }
    }
}