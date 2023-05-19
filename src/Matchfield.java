public class Matchfield {
    private Field[] fields = new Field[40];
    private boolean[][] homefields = new boolean[4][4]; //team, field
    public Matchfield(){
        for(int i = 0; i < 40; i++) {
            for (int n = 0; i < 40; i++) {
                homefields[i][n] = false;
            }
        }
    }

    public Field[] getFields() {
        return fields;
    }

    public void setFields(int i, boolean b) {

    }
}
