package uk.gov.metoffice.hello.ser;

import java.util.List;
import java.util.Objects;

/**
 * {A thing} to {do something} for {another thing}
 * -- for example, {this}
 * -- and also {this}
 */
// TODO fill in Javadoc
public class MoreComplicatedObject {

    private String sessionName;

    private List<Person> attendees;

    private Integer year;

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public List<Person> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Person> attendees) {
        this.attendees = attendees;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoreComplicatedObject that = (MoreComplicatedObject) o;
        return Objects.equals(sessionName, that.sessionName) && Objects.equals(attendees, that.attendees) && Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionName, attendees, year);
    }

    @Override
    public String toString() {
        return "MoreComplicatedObject{" +
                "sessionName='" + sessionName + '\'' +
                ", attendees=" + attendees +
                ", year=" + year +
                '}';
    }
}
