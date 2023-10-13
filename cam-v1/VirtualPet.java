/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hi friend, my name is Charmy. Today I have to feed everyone in the Black Bulls and you're gonna help me pick what I feed everyone!");
    }
    
    public void likesFood(Boolean x) {
        if (x){
            face.setMessage("Laaa, I like food too");
        }
        else{
            face.setImage("mad");
            face.setMessage("LAAA, HOW DARE YOU!");
        }
    }




    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

} // end Virtual Pet
