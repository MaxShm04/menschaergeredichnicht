public class Game {

    /*  TODO:
        - werfen
        - haus
        - schlauer zug
     */
    private static Matchfield matchfield;
    private static Team[] teams = new Team[4];

    public static void main(String[] args) {
        matchfield = new Matchfield();
        for(int i = 0; i < 4; i++) {
            teams[i] = new Team(i, i*10, matchfield);
        }
        printAllLocations();
    }

    public static void printAllLocations(){
        for(Team t : teams){
            System.out.println(t.getId());
            for(Figures f : t.getFigures()){
                System.out.println(f.getField());
            }
        }
    }


    public static int roll(int min, int max){
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void play(){
        boolean exit = false;
        int actTeamInd = 0;
        while(!exit){
            Team team = teams[actTeamInd];
            int dice = roll(1, 6);
            if(!team.isOnField() && dice != 6){   //kann nicht raus
                continue;
            } else if(!team.isOnField() && dice == 6) {   //kommt raus
                dice = roll(1, 6);
                Figures figure = team.getFigures().get(0);
                figure.setField(figure.getField()+dice);
            }else{                                         //normaler zug
                Figures figure = team.getClosest();
                figure.step(dice);                          //step
            }


            if(actTeamInd != 3){           //switch Teams
                actTeamInd += 1;
            }else{
                actTeamInd = 0;
            }
            exit = true;
        }
    }
}
