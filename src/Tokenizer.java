import model.Student;

public class Tokenizer {

    public static void main(String[] args) {

        Student Florin = new Student(20, "Florin", "Hanu", "Cluj-Napoca", "Română", 4);
        System.out.println("This is what Florin looks like when he's stringed: " + Florin + " ...");
        String Info = Florin.toString();
        String[] Token = Info.split(", ");
        Student FlorinTokened = new Student(Integer.parseInt(Token[0]),  Token[1], Token[2], Token[3], Token[4], Float.parseFloat(Token[5]));
        System.out.println("... and this is what he looks like with the Tokenizer: " + FlorinTokened);

    }
}