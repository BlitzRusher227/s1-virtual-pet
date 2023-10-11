import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {
    
    public Runner(){
        VirtualPet v = new VirtualPet();
        v.exercise();
        takeABeat(1);
        v.feed();
        String ans = getAnswer("How are you?");
        }
    
        public String getAnswer(String a){
            String s = (String)JOptionPane.showInputDialog(
         new JFrame(),
         a,
         "Question?",
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
