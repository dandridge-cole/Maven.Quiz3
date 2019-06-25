package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    LabStatus ls;
    String ln;
    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.ln=labName;
    }

    public String getName() {
        return ln;
    }

    public void setStatus(LabStatus labStatus) {
        this.ls = labStatus;
    }

    public LabStatus getStatus() {
        return ls;
    }
}
