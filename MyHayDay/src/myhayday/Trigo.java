/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myhayday;

/**
 *
 * @author aiman
 */
public class Trigo {

    //----------------------
    // Atributos
    //----------------------
    public static final String ICONO = "/img/trigo.png";
    public static final int DURACION = 2;
    public static final int EXPERIENCIA = 1;
    public static final int PRECIO_VENTA = 2;
    public static final int RIEGO = 10;

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trigo{");
        sb.append("icono=").append(icono);
        sb.append(", duracionProduccion=").append(duracionProduccion);
        sb.append(", experienciaRecolecta=").append(experienciaRecolecta);
        sb.append(", precioVenta=").append(precioVenta);
        sb.append(", riego=").append(riego);
        sb.append('}');
        return sb.toString();
    }


    private String icono;
    private int duracionProduccion;
    private int experienciaRecolecta;
    private int precioVenta;
    private int riego;

    //----------------------
    // Constructores
    //----------------------
    public Trigo(String icono, int duracionProduccion, int experienciaRecolecta, int precioVenta, int riego) {
        this.icono = icono;
        this.duracionProduccion = duracionProduccion;
        this.experienciaRecolecta = experienciaRecolecta;
        this.precioVenta = precioVenta;
        this.riego = riego;
    }

    public Trigo() {
        this(ICONO, DURACION, EXPERIENCIA, PRECIO_VENTA, RIEGO);
    }
    
    public Trigo(Trigo otro){
        this(otro.icono, otro.duracionProduccion, otro.experienciaRecolecta, otro.precioVenta, otro.riego);
    }
    
    public static void main(String[] args) {
        Trigo t1 = new Trigo();
        Trigo t2 = new Trigo(Trigo.ICONO, 3, 10, 20, 1);
        Trigo t3 = new Trigo(t1);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        // Test getters & setter.
        System.out.println("Precio: " + t1.getPrecioVenta());
        System.out.println("Duración de la producción: " + t1.getDuracionProduccion());
        System.out.println("EXP: " + t1.getExperienciaRecolecta());
        System.out.println("Path del icono: " + t1.getIcono());
        
 
    }

    public String getIcono() {
        return icono;
    }

    public int getDuracionProduccion() {
        return duracionProduccion;
    }

    public int getExperienciaRecolecta() {
        return experienciaRecolecta;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public int getRiego() {
        return riego;
    }
}
