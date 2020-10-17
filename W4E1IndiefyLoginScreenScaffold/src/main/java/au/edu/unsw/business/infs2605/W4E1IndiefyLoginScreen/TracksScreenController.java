package au.edu.unsw.business.infs2605.W4E1IndiefyLoginScreen;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.util.ArrayList;


public class TracksScreenController {

    @FXML
    TableView<Track> trackView;

    @FXML
    public void initialize() throws SQLException {
        ObservableList<Track> data = trackView.getItems();
        ArrayList<Track> tracks = DatabaseManager.fetchAllTracks();
        data.addAll(tracks);
    }

}
