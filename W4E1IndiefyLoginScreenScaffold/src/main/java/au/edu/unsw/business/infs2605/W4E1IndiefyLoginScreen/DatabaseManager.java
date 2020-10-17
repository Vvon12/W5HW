package au.edu.unsw.business.infs2605.W4E1IndiefyLoginScreen;

import java.sql.*;
import org.mindrot.jbcrypt.BCrypt;
import java.util.ArrayList;

public class DatabaseManager {

    public static boolean login(String userName, String password) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:sqlite:indiefy.db");
        String sql = "SELECT password FROM users WHERE username = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, userName);
        ResultSet rs = st.executeQuery();
        String realPassword = "";

        while(rs.next()){
            realPassword = rs.getString("password");
        }
        return BCrypt.checkpw(password, realPassword);
    }

    public static ArrayList<Track> fetchAllTracks() throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:sqlite:indiefy.db");
        String sql = "SELECT * FROM tracks";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Track> tracks = new ArrayList<Track>();
        while(rs.next()){
            tracks.add(new Track(rs.getString("track"), rs.getString("artist"),
                    rs.getString("album"), rs.getString("genre")));
        }
        return tracks;
    }
}
