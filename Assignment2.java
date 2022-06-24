import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Messager message1 = new Messager("Message 1");
		Messager message2 = new Messager("Message 2");
		
		//send and get messages
		try {
			message1.connect(message2);
			System.out.println("Enter multiple sentences (enter an empty string to exit):");
			while (true) {
				String sentence = scanner.nextLine();
				if (sentence.isEmpty())
					break;
				message1.send(sentence);
			}
			
			message2.receive();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		scanner.close();
		
		//display messages of m2
		message2.printAll();
	}
}