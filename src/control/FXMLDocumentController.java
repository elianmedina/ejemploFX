/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import modelo.Estudiante;

/**
 *
 * @author elian.medina
 */
public class FXMLDocumentController implements Initializable {
    LinkedList<Estudiante> listaE;
    @FXML
    private Label titulo;
    @FXML
    private Label nombreE;
    @FXML
    private TextField textoNombreE;
    @FXML
    private Label correoE;
    @FXML
    private TextField textoCorreoE;
    @FXML
    private Label direccionE;
    @FXML
    private TextField textoDireccionE;
    @FXML
    private Label carreraE;
    @FXML
    private TextField textoCarreraE;
    @FXML
    private Label codigoE;
    @FXML
    private TextField textoCodigoE;
    @FXML
    private void agregarE(ActionEvent event) {
        System.out.println("Estoy en Agregar");
        
        //listaE = new LinkedList<>(); <-- eso va en el constructor de la clase
        String nome=textoNombreE.getText();
        String correo= textoCorreoE.getText();
        String direccion=textoDireccionE.getText();
        String carrerae= textoCarreraE.getText();
        String code= textoCodigoE.getText();
        
        Estudiante objEstudiante = new Estudiante(carrerae, code, direccion, correo, nome);
        
        listaE.add(objEstudiante);
        
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
    }
    @FXML
    private void mostrarE(ActionEvent event) {
        String mostrar = "";
        for (int i = 0; i < listaE.size(); i++) {
            Estudiante obje = listaE.get(i);
            mostrar+=obje.toString()+"\n";
            
        }
        JOptionPane.showMessageDialog(null, mostrar);
        
        
        

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        listaE=new LinkedList<>();;
    }    
    
}
