package com.example.techbuild;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class s_delivered_mater implements Initializable {

    @FXML
    private TableView<oop_del_mater> table_delivmat;

    @FXML
    private TableColumn<oop_del_mater, Date> col_date;

    @FXML
    private TableColumn<oop_del_mater, String> col_manufacturer;

    @FXML
    private TableColumn<oop_del_mater, String> col_name;

    @FXML
    private TableColumn<oop_del_mater, Integer> col_num;

    @FXML
    private TableColumn<oop_del_mater, Integer> col_quantity;

    @FXML
    private TableColumn<oop_del_mater, Integer> col_weight;

    public void exit(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("main_login.fxml", actionEvent);
    }

    public void list_mater(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_list_mater.fxml", actionEvent);
    }

    public void deliver_the_materials(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_deliver_mater.fxml", actionEvent);
    }

    public void required_to_deliver(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_req_to_deliver.fxml", actionEvent);
    }

    public void delivered_materials(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_delivered_mater.fxml", actionEvent);
    }

    public void percentage(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_percentage.fxml", actionEvent);
    }

    public void info(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_info.fxml", actionEvent);
    }

    ObservableList<oop_del_mater> listM;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            UpdateTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void UpdateTable() throws Exception {
        col_num.setCellValueFactory(new PropertyValueFactory<>("number"));
        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_manufacturer.setCellValueFactory(new PropertyValueFactory<>("manufacturer"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        col_weight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        col_date.setCellValueFactory(new PropertyValueFactory<>("date"));

        listM = connectionsql.getDelmaterials();
        table_delivmat.setItems(listM);
    }
}