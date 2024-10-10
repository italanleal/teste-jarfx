module br.upe {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.upe to javafx.fxml;
    exports br.upe;
}
