import java.util.ArrayList;

public class Team {
    private ArrayList<Figures> figures;
    private int id;
    private int homeField;
    private int startField;
    private boolean onField;
    private Matchfield matchfield;

    private ArrayList<Figures> atHome;

    public Team(int id, int startField, Matchfield matchfield){
        this.matchfield = matchfield;
        figures = new ArrayList<>();
        this.id = id;
        this.startField = startField;
        homeField = startField + 1;
        onField = false;
        for(int i=0; i<4; i++){
            figures.add(new Figures(startField, matchfield, this, i));
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Figures> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figures> figures) {
        this.figures = figures;
    }

    public boolean isOnField() {
        return onField;
    }

    public void setOnField(boolean onField) {
        this.onField = onField;
    }

    public Figures getClosest(){
        Figures closest = figures.get(0);
        for(Figures f : figures){
            if(f.getFieldsToHome() > closest.getFieldsToHome()){
                closest = f;
            }
        }
        return closest;
    }
}
