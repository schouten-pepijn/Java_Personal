package commandPattern.problem;

public class Button {
    private String label;

    public void click() {
        // This code is dependent on where we use the 
        // button, because the execution is different
    }



    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
