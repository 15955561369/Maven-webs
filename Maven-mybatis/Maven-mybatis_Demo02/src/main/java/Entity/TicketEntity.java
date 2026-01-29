package Entity;

import java.util.Date;

public class TicketEntity {
    private String id;
    private String departure_point;
    private Date departure_time;
    private String arrive_point;
    private Date arrive_time;
    private Float fare;

    public TicketEntity() {

    }
    public TicketEntity(String id, String departure_point, Date departure_time, String arrive_point, Date arrive_time, Float fare) {
        this.id = id;
        this.departure_point = departure_point;
        this.departure_time = departure_time;
        this.arrive_point = arrive_point;
        this.arrive_time = arrive_time;
        this.fare = fare;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeparture_point() {
        return departure_point;
    }

    public void setDeparture_point(String departure_point) {
        this.departure_point = departure_point;
    }


    public String getArrive_point() {
        return arrive_point;
    }

    public void setArrive_point(String arrive_point) {
        this.arrive_point = arrive_point;
    }


    public Date getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(Date arrive_time) {
        this.arrive_time = arrive_time;
    }

    public Date getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Date departure_time) {
        this.departure_time = departure_time;
    }

    public Float getFare() {
        return fare;
    }

    public void setFare(Float fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "TicketEntity{" + "id=" + id + ", departure_point=" + departure_point + ",departure_time=" + departure_time +
                ",arrive_point=" + arrive_point + ",arrive_time=" + arrive_time + ",fare=" + fare + '}';
    }
}
