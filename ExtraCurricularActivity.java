import java.time.LocalDate;
import java.util.List;

public class ExtraCurricularActivity {
    // Attributes
    private int activityID;
    private String activityName;
    private String description;
    private String category;
    private String location;
    private String schedule;
    private String leader;
    private List<String> participants;
    private LocalDate startDate;
    private LocalDate endDate;
    private double cost;

    // Constructors
    public ExtraCurricularActivity(int activityID, String activityName, String description,
                                   String category, String location, String schedule, String leader,
                                   List<String> participants, LocalDate startDate, LocalDate endDate,
                                   double cost) {
        this.activityID = activityID;
        this.activityName = activityName;
        this.description = description;
        this.category = category;
        this.location = location;
        this.schedule = schedule;
        this.leader = leader;
        this.participants = participants;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
    }

    // Getter and Setter methods
    public int getActivityID() {
        return activityID;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // toString method
    @Override
    public String toString() {
        return "ExtraCurricularActivity{" +
                "activityID=" + activityID +
                ", activityName='" + activityName + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", location='" + location + '\'' +
                ", schedule='" + schedule + '\'' +
                ", leader='" + leader + '\'' +
                ", participants=" + participants +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", cost=" + cost +
                '}';
    }
}
