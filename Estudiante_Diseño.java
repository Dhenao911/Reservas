package Reservas;

public class Estudiante_Diseño {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String modalidad;
    private int numAsignaturas;
    private String serial;

    public Estudiante_Diseño(String Cedula, String Nombre, String Apellido, String Telefono, String Modalidad,int NumAsignaturas,
            String Serial) {

        cedula = Cedula;
        nombre = Nombre;
        apellido = Apellido;
        telefono = Telefono;
        modalidad = Modalidad;
        numAsignaturas= NumAsignaturas;
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

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getNumAsignaturas() {
        return numAsignaturas;
    }

    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    

}
