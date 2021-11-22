public class NintendoSwitch {
    private String nombreUsuario;
    private int dineroEnLaCuenta;
    private boolean consolaEncendida;

    public NintendoSwitch(String nombre, int dinero, boolean encendidaono){
        nombreUsuario= nombre;
        dineroEnLaCuenta=dinero;
        consolaEncendida=encendidaono;
    }

    public String getUsuario(){
        return nombreUsuario;
    }

    public int getDinero(){
        return dineroEnLaCuenta;
    }

    public boolean getEstado(){
        return consolaEncendida;
    }    

    public void setUsuario(String usuario){
        nombreUsuario = usuario;
    }

    public void agregarDinero(int dineroIntroducido){
        dineroEnLaCuenta = dineroEnLaCuenta + dineroIntroducido;
    }

    public void pulsarBotonEncendido(){
        if( consolaEncendida == true) {
            consolaEncendida = false;
        }
        
        else {
            consolaEncendida = true;
        }
            
        
    }

    public void configuracion(){
        System.out.println( "Usuario:" + nombreUsuario + "Saldo:" + dineroEnLaCuenta + "Estado consola:" + consolaEncendida);
    }       

    public String verConfiguracion(){
        String configuracion = "Usuario:" + nombreUsuario + "Saldo:" + dineroEnLaCuenta + "Estado consola:" + consolaEncendida;
        return configuracion;
    }
}