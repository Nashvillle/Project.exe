
public class Machine {

    private int id;
    private String name;
    private String location;
    private String lastMaintenance;
    private String nextMaintenance;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getLastMaintenance() { return lastMaintenance; }
    public void setLastMaintenance(String lastMaintenance) { this.lastMaintenance = lastMaintenance; }

    public String getNextMaintenance() { return nextMaintenance; }
    public void setNextMaintenance(String nextMaintenance) { this.nextMaintenance = nextMaintenance; }
}
