public class Main {
    public static void main(String[] args) {
        Character Song_rank_E = new Character(100,50);
        Song_rank_E.swingSword();
        Song_rank_E.swingSword();
        Song_rank_E.swingSword();
        Song_rank_E.swingSword();
        Song_rank_E.swingSword();

        System.out.println(" ");

        Song_rank_E.takeDamage(30);
        Song_rank_E.takeDamage(50);
        Song_rank_E.takeDamage(20);

        System.out.println(" ");
        Song_rank_E.rest();
    }
}
