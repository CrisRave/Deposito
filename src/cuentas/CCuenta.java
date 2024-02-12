package cuentas;

/**
 * Está clase se utiliza para la gestión de una cuenta bancaria
 */
public class CCuenta {
    /**
     * Representa el nombre descriptivo de la cuenta
     */
    private String nombre;

    /**
     * Representa el número único de la cuenta
     */
    private String cuenta;

    /**
     * Representa el la cantidad de dinero actual de la cuenta
     */
    private double saldo;

    /**
     * Representa el valor del interés aplicado a la cuenta
     */
    private double tipoInteres;

    /**
     * Constructor vacío
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * @param nom El nombre que se asignará a la nueva CCuenta
     * @param cue El número de cuenta que se asignará a la nueva CCuenta
     * @param sal El saldo que se asignará a la nueva CCuenta
     * @param tipo El tipoInterés se asignará la nueva CCuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }

    /**
     * Método para obtener el saldo de la cuenta
      * @return El saldo actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar una cantidad en la cuenta aumentando el saldo actual
     * @param cantidad Cantidad de dinero a ingresar, debe ser una cantidad positiva,
     * @throws Exception Cuando se intenta ngresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");

        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Métdo para retirar una cantidad en la cuenta restando el saldo actual
     * @param cantidad  de dinero que haya en la cuenta
     * @throws Exception Cuento se intenta retirar una cantidad negativa o con insuficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Getter del atributo nombre
     * @return el atributo nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo nombre
     * @param nombre el nuevo valor para el atributo nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo cuenta
     * @return el atributo cuenta
     */
    public java.lang.String getCuenta() {
        return cuenta;
    }

    /**
     * Setter del atributo cuenta
     * @param cuenta el nuevo valor para el atributo cuenta
     */
    public void setCuenta(java.lang.String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter del atributo saldo
     * @return el atributo saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter del atributo saldo
     * @param saldo el nuevo valor para el atributo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter del atributo tipoInteres
     * @return el atributo tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Setter del atributo tipoInteres
     * @param tipoInteres el nuevo valor para el atributo tipoInteres
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}