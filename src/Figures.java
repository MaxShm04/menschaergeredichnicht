public class Figures {

    /*
        TODO:
        - zug ins haus
     */
    private int field;
    private int resField;
    private int fieldsToHome;
    private Matchfield matchfield;
    private Team team;
    private int FigureID;

    public Figures(int stField, Matchfield matchfield, Team team, int id){
        field = stField;
        resField = stField;
        fieldsToHome = 41;
        this.matchfield = matchfield;
        this.team = team;
        FigureID = id;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public void step(int fields){   //fieldstohome == 0: steht vor dem ziel, noch auf dem brett
        fieldsToHome -= fields;
        if(fieldsToHome < -4){     //kann nicht ziehen, zu große zahl
              return;
        }
        field += fields;            //add
        if(field > 39){             //ende liste, jump nach vorne
            field -= 40;
        }

        if(fieldsToHome < 0){  //wenn ins haus ziehen, immer [-4; 1]


        }
         System.out.println("Team " + team + ", Figure " +  FigureID + ", jump to field " + field);
    }

    public int getResField() {
        return resField;
    }

    public void setResField() {
        field = resField;
    }

    public int getFieldsToHome() {
        return fieldsToHome;
    }

    public void setFieldsToHome(int fieldsToHome) {
        this.fieldsToHome = fieldsToHome;
    }
}
