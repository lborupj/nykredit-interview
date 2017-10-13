package dk.nykredit.interview;

/**
 * Pet  
 */
public class Pet {

    private String id;
    private String name;
    private Pet.Type type;

    public Pet(String id, String name, Type type) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public Pet.Type getType() {
        return type;
    }
    
    void setId(String id) {
        this.id = id;
    }

    /**
     * Type of Pet enum 
     */
    enum Type {
        DOG, CAT
    }
    
}
