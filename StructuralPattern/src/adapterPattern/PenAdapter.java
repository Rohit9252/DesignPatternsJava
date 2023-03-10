package adapterPattern;

public class PenAdapter implements Pen {

    private PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.mark(str);

    }






}
