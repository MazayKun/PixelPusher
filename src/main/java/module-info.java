module com.mazay.pixelpusher {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mazay.pixelpusher to javafx.fxml;
    exports com.mazay.pixelpusher;
}