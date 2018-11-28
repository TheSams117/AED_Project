package com.triadamcola.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

import com.triadamcola.model.Order;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.collections.ObservableList;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.text.TabableView;
import javafx.collections.FXCollections;



public class COrders implements Initializable {
	
    @FXML
    private TableView<Order> tableView;

    @FXML
    private Button btnAddOrder;

    @FXML
    private Button btnDelateOrder;

    @FXML
    private Label labUserName;

    @FXML
    private Button btnDeliverOrder;

    @FXML
    void addOrder(ActionEvent event) {
    	
    }

    @FXML
    void delateOrder(ActionEvent event) {

    }

    @FXML
    void deliverOrder(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<Order> observableList =  FXCollections.observableArrayList(Order.getOrders());
		tableView.setItems(observableList);
		
	}

}
