package ru.vsu.cs.maslovaei;

public class Picture {

    private final Line line;
    private final Parabola parabola;
    private final HorizontalParabola horizontalParabola;

    public Picture (Line line, Parabola parabola, HorizontalParabola horizontalParabola){
        this.line = line;
        this.parabola = parabola;
        this.horizontalParabola = horizontalParabola;
    }

    public SimpleColor getColor(double x, double y) {

        if (parabola.isPointAboveParabola(x, y)) {
            return SimpleColor.GRAY;
        }
        if (!horizontalParabola.isPointLeftOfParabola(x, y) && !parabola.isPointAboveParabola(x, y) && x < 5 && y > 3) {
            return SimpleColor.WHITE;
        }
        if (horizontalParabola.isPointLeftOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.BLUE;
    }

}