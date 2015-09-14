package demo.domain;

import javax.persistence.*;

/**
 * Created by sanjidagafur on 08/09/2015.
 */
@Entity
@Table(name = "program")
public class Program {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    String programName;

    @Column()
    private String destination;

    @Column()
    private String wayOfShipment;

    @Column()
    private String handOverDate;

    public Program(){

    }

    public Program(String programName, String destination, String wayOfShipment, String handOverDate) {
        this.programName = programName;
        this.destination = destination;
        this.wayOfShipment = wayOfShipment;
        this.handOverDate = handOverDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getWayOfShipment() {
        return wayOfShipment;
    }

    public void setWayOfShipment(String wayOfShipment) {
        this.wayOfShipment = wayOfShipment;
    }

    public String getHandOverDate() {
        return handOverDate;
    }

    public void setHandOverDate(String handOverDate) {
        this.handOverDate = handOverDate;
    }

    @Override
    public String toString() {
        return "Program {" +
                "id=" + id +
                ", name='" + programName + '\'' +
                ", destination='" + destination + '\'' +
                ", wayOfShipment='" + wayOfShipment + '\'' +
                ", handOverDate='" + handOverDate +'\''+
                '}';
    }
}

