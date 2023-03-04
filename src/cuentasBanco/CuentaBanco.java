package cuentasBanco;

/**
 * @author Raquel González Lara
 * @version 1.0
 * @since 25/02/2023
 * 
 * 
 */
public class CuentaBanco {


    /**
     * Definimos las variables
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CuentaBanco()
    {
    }

    /**
     * Creamos getter y setter
     * 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    
    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * @return metodo para devolver el saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * @param cantidad metodo para ingresar dinero
     * @throws Exception esto es para que no puedas ingresar numeros negativos
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * @param cantidad metodo para retirar saldo
     * @throws Exception para que no puedas retirar cantidades / números negativos
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
	 * getter y setter creados con refactor:
	 */ 
    
	/**
	 * @return getter y devolvemos nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre setter de nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
