package DROS;
public class Deteccionentredosbuques extends Deteccionindividual{   
    public String AlturabuqueB;  
    private double alturabuque1;
    private double alturabuque2;
    private double distancia;
    private double raiz1;
    private double raiz2;
    
    public Deteccionentredosbuques() {      
        super.AlturaRadar=null;
        super.Distanciadeteccion=null;
        this.AlturabuqueB=null;     
        alturabuque1 =0;
        alturabuque2 =0;
        distancia=0;
        raiz1=0;
        raiz2=0;
}       
    public Deteccionentredosbuques (String alturaradar, String distanciadeteccion,
            String alturabuqueB){
        super.AlturaRadar= alturaradar;
        super.Distanciadeteccion=distanciadeteccion;
        this.AlturabuqueB=alturabuqueB;
    }
    public String registrodedatosdebuques(String alturaradar, String distanciadeteccion,
            String alturabuqueB){
        this.AlturabuqueB =alturabuqueB;
        String i = super.registrodedatos(alturaradar, distanciadeteccion) + 
                "Altura del buque 2: "+ this.AlturabuqueB + "\n";
        return i;
    }
    public double calculodedistanciadosbuques (double altbuque1, double altbuque2)
    {
        alturabuque1 = altbuque1;
        alturabuque2 = altbuque2;
        raiz1= Math.sqrt(alturabuque1);
        raiz2=Math.sqrt(alturabuque2);
        distancia = (3.572)*(raiz1 + raiz2);
        return distancia;
    }
}
