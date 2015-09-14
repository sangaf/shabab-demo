package demo.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanjidagafur on 10/09/2015.
 */
public class Programs {

    List<Program> programs;

    public Programs(){

    }

    public Programs(List<Program> programs) {
        this.programs = programs;
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }
}
