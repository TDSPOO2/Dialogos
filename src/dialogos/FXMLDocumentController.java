package dialogos;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class FXMLDocumentController implements Initializable {
    
@FXML
    private void ventanaInformacion(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Ventana de informacion");
        alert.setHeaderText("Informacion");
        alert.setContentText("Mensaje!");
        alert.showAndWait();
    }
    
    @FXML
    private void ventanaAdvertencia(ActionEvent event) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Ventana de Advertencia");
        alert.setHeaderText("Advertencia");
        alert.setContentText("Mensaje de advertencia!");
        alert.showAndWait();
    }
    
    @FXML
    private void ventanaError(ActionEvent event) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Ventana de Error");
        alert.setHeaderText("Error");
        alert.setContentText("Mensaje de error!");
        alert.showAndWait();
    }
    
    @FXML
    private void ventanaConfirmacion(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Ventana de confirmacion");
        alert.setHeaderText("Confirmacion");
        alert.setContentText("¿Esta seguro de realizar esta accion?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            //Instrucciones al dar confirmar la accion
            System.out.println("Confirmacion: OK");
        } else {
            //Instrucciones al cancelar la accion
            System.out.println("Confirmacion: Cancelar");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
