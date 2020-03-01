package DROS;
public class Deteccionindividual {
    public String AlturaRadar;
    public String Distanciadeteccion;
    private double alturabuque1;
    private double Distancia=0;
    private double Radio=6386944;
    private double radiomasaltura;
    private double radiomasaltura2;
    private double radio2;
    private double resultadocontent;
    
    public String registrodedatos (String alturabuqueA, String 
            distanciadeteccion)
    {
        this.AlturaRadar = alturabuqueA;
        this.Distanciadeteccion = distanciadeteccion;    
        String i = "Altura del radar detección: " + this.AlturaRadar + "\n"
                + "Distancia de deteccion: " + this.Distanciadeteccion + "\n";
        return i;             
    }
    public double calculodedistanciaunbuque (double altbuque1)
    {
        alturabuque1=altbuque1;
        radiomasaltura=(Radio + alturabuque1);
        radiomasaltura2= radiomasaltura * radiomasaltura;
        radio2= Radio*Radio;
        resultadocontent= radiomasaltura2-radio2;
        Distancia = (Math.sqrt(resultadocontent)) /1000;
        return Distancia;
    }
}
