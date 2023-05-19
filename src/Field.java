public class Field {

    /*
    TODO:
    - nicht eigenes Team schmeissen
     */

    private boolean hasFigure;
    private Figures figure;

    public Field(){
        hasFigure = false;
        figure = null;
    }

    public Figures moveTo(Figures figureNew, Field fieldOld){
        if(figure == null){
            figure = figureNew;
            fieldOld.resetFigure();
            return null;
        }else{
            Figures t = figure;
            figure = figureNew;
            return t;
        }
    }

    public void resetFigure(){
        figure = null;
    }


}
