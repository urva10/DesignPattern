package behavioural;

public class AttackStrategy implements TeamStrategy{

    @Override
    public void play(String team) {
        System.out.println(team+ " will play attacking mode");
    }
}
