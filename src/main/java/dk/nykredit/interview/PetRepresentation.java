package dk.nykredit.interview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PetRepresentation {

    private String name;
    private Pet.Type type;

    @JsonCreator
    public PetRepresentation(@JsonProperty("name") String name, @JsonProperty("type") Pet.Type type) {
        this.name = name;
        this.type = type;
    }
    
    public PetRepresentation(Pet pet) {
        this.name = pet.getName();
        this.type = pet.getType();
    }

    public String getName() {
        return name;
    }

    public Pet.Type getType() {
        return type;
    }
    
}
