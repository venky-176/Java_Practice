package Abstraction;

public class Game {
    static void main(String[] args) {
        PlayStation ps= new PlayStation();
        ps.StartGame();
        Xbox xb= new Xbox();
        xb.StartGame();
        ps.displayConsoleDetails();
    }
}
