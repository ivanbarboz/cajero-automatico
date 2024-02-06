package traFinal;

public class Cliente {
    private String dni;
    private String nombre;
    private String password;
    private double saldo;

    public Cliente(String dni, String nombre, String password) {
        this.dni = dni;
        this.nombre = nombre;
        this.password = password;
        this.saldo = 0.0; // Saldo inicial es cero
    }

    public void realizarDeposito(double monto) {
        this.saldo += monto;
    }

    public void realizarRetiro(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
        } 
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
