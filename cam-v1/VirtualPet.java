/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("intro");
        face.setMessage("Hi friend, my name is Charmy. Today I have to feed everyone in the Black Bulls and you're gonna help me pick what I feed everyone!");
    }
    
    public void likesFood(Boolean x) {
        if (x){
            face.setImage("charmy");
            face.setMessage("Laaa, I like food too");
        }
        else{
            face.setImage("mad");
            face.setMessage("LAAA, HOW DARE YOU! You must have a horrible life");
        }
    }

    public void asta(){
        face.setImage("asta");
        face.setMessage("This is Asta laa, he's a little dumb so he only likes food that he can say. (Which is less than 5 words).");
    }
    public void feedAsta(String food1){

        if (feed(5, food1.length())){
            face.setImage("goodAsta");
            face.setMessage("I think he likes it laa, I'll try some too!");
            takeABeat(3000);
            face.setImage("digin");
        }
        else {
            face.setImage("badAsta");
            face.setMessage("Uh oh, he doesn't seem to like it.");
            takeABeat(3000);
            face.setImage("digin");
            face.setMessage("Guess I can have it then!");
        }

    }

    public void feedYami(){

    }

    public boolean feed(int letters, int length){
        if (length <= letters){
            return true;
        }
        return false;

    }


    public String getAnswer(String a){
     // string s = the input of the user
        String s = (String)JOptionPane.showInputDialog(
     new JFrame(),
     a, // the question
     "Question?", //title of frame
     JOptionPane.PLAIN_MESSAGE
    );
    return s;
    } 
    public void takeABeat (int milliseconds){
        try {
        Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){
    
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
