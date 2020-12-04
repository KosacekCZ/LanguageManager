import java.util.Scanner;

public enum InputManager {
    INSTANCE;
    private Scanner UserInput = new Scanner(System.in);
    public String getInput(){
    return UserInput.nextLine();
    }



}

