package behavioural;
public class Main {
    public static void main(String[] args) {
        Team teamGermany=new TeamGermany();
        Team teamArgentina=new TeamArgentina();

        //strategy

        TeamStrategy attack=new AttackStrategy();
        TeamStrategy defend=new DefendStrategy();

        //germany starts game with defensive mode
        //argentina starts game with attacking mode

        teamGermany.setTeamStrategy(defend);
        teamArgentina.setTeamStrategy(attack);

        teamGermany.setTeamName("Germany");
        teamArgentina.setTeamName("Argentina");

        teamGermany.teamInfo();
        teamGermany.playGame();
        teamArgentina.teamInfo();
        teamArgentina.playGame();
    }
}