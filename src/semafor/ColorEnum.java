package semafor;

public enum ColorEnum {
    TGreenYellowRed(true,false,false),
    GreenTYellowRed(false,true,false),
    GreenYellowTRed(false,false,true),
    GreenYellowRed(false, false, false);

    private ColorEnum(boolean green, boolean yellow, boolean red) {
        this.green = green;
        this.yellow = yellow;
        this.red = red;
    }
    
    public boolean green;
    public boolean yellow;
    public boolean red;

    @Override
    public String toString() {
        return "ColorEnum{" + "green=" + green + ", yellow=" + yellow + ", red=" + red + '}';
    }
    
    
}
