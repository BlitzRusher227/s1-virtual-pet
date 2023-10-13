import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {
    
    public Runner(){
        VirtualPet v = new VirtualPet();
        takeABeat(3000);
        String likeEating = getAnswer("Before we get started, do you like to eat?");
        boolean likeFood = (likeEating.contains("y")||likeEating.contains("Y"));
        v.likesFood(likeFood);
        takeABeat(2000);
        

        // v.exercise();
        // takeABeat(5000);
        // v.feed();
        // String ans = getAnswer("How are you?");

        // greetings
                //excited to try your food
        //   i cant say long words so I dont like food that is a logn word
        // try food
        // once hes eaten 3 good things - Bloated
        // once hes eaten 3 bad things - diahrea



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
        
    



    public static void main(String[] args) {
        new Runner();
        
    }
    
}
