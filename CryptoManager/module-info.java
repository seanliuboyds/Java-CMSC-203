module com.example.demo4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.demo4 to javafx.fxml;
    //exports com.example.demo4;
    exports _student;
    opens _student to javafx.fxml;
    exports _solution;
    opens _solution to javafx.fxml;
}