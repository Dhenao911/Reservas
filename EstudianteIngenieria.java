package Reservas;

public class EstudianteIngenieria {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String semestre;
    private String serial;

    public EstudianteIngenieria(String Cedula, String Nombre, String Apellido, String Telefono, String Semestre,
            String Serial) {

        cedula = Cedula;
        nombre = Nombre;
        apellido = Apellido;
        telefono = Telefono;
        semestre = Semestre;
        serial = Serial;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}

