module fr.iutmetz.info.projetrobot {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.iutmetz.info.projetrobot to javafx.fxml;
    exports fr.iutmetz.info.projetrobot;
}