module fr.envel.coursjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.envel.coursjavafx to javafx.fxml;
    exports fr.envel.coursjavafx;
}