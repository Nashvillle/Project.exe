
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MachineDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/bruh";
    private static final String USER = "root";
    private static final String PASS = "Nash#236";

    public List<Machine> getAllMachines() {

        List<Machine> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USER, PASS);

            String sql = "SELECT * FROM machines";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Machine m = new Machine();
                m.setId(rs.getInt("id"));
                m.setName(rs.getString("name"));
                m.setLocation(rs.getString("location"));
                m.setLastMaintenance(rs.getString("last_maintenance"));
                m.setNextMaintenance(rs.getString("next_maintenance"));
                list.add(m);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
