module iub.lcmanagementoperation {
    requires javafx.controls;
    requires javafx.fxml;


    opens iub.lcmanagementoperation to javafx.fxml;
    exports iub.lcmanagementoperation;
}