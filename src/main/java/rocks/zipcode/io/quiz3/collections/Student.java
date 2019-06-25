package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    public List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for(Lab lab:this.labs)if(lab.getName().equals(labName))return lab;
        Lab lab = new Lab(labName);
        labs.add(lab);
        return lab;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        if(lab.getStatus()==null)throw(new UnsupportedOperationException());
        if(lab.getStatus().equals(LabStatus.PENDING)){
            lab.setStatus(labStatus);
            return;
        }
        else throw(new UnsupportedOperationException());
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        for(int i = 0; i<labs.size();i++) if(this.labs.get(i).equals(lab)) return;
        this.labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i=this.labs.size()-1;i>0;i--)
            builder.append(String.format("%s > %s\n",this.labs.get(i).getName(),this.labs.get(i).getStatus()));
        builder.append(String.format("%s > %s",this.labs.get(0).getName(),this.labs.get(0).getStatus()));
        return builder.toString();
    }
}
