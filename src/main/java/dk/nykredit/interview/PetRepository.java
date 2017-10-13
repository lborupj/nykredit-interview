package dk.nykredit.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import javax.ejb.Stateless;

/**
 * Dummy in-mem repository of {@link Pet} objects 
 */
@Stateless
public class PetRepository {

    private static Map<String, Pet> DUMMY_STORAGE = new HashMap<>();
    
    public Optional<Pet> get(String id) {
        return Optional.ofNullable(DUMMY_STORAGE.get(id));
    }
    
    public void put(Pet pet) {
        if (pet.getId() == null) {
            pet.setId(UUID.randomUUID().toString());
        }
        DUMMY_STORAGE.put(pet.getId(), pet);
    }
    
}
