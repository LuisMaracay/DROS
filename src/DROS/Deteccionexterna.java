package DROS;
public class Deteccionexterna extends Deteccionindividual{
    public String Distanciabuqueenem;
    public String altitud;
    private double alturaAeronave;
    private double Distancia;
    private double alturapaso1;
    private double alturapaso2;
    private double alturapaso3;
    private double Radio=6400;
    
    public Deteccionexterna() {      
        super.Distanciadeteccion=null; 
        super.AlturaRadar=null;
        this.Distanciabuqueenem=null;
        this.altitud=null;
        Distancia=0;
        alturaAeronave =0;
        alturapaso1=0;
        alturapaso2=0;
        alturapaso3=0;
    }
        
    public Deteccionexterna (String distanciabuqueenem, String alturaradar,
            String Altitud, String distanciadeteccion){
        super.Distanciadeteccion=distanciadeteccion;
        super.AlturaRadar=alturaradar;
        this.Distanciabuqueenem=distanciabuqueenem;
        this.altitud=Altitud;
}
    public String registrodedatosdebuqueyaeronave(String alturaradar, String 
            distanciabuqueenem, String Altitud, String distanciadeteccion){
        this.Distanciabuqueenem =distanciabuqueenem;
        this.altitud=Altitud;
        
        String i = super.registrodedatos(alturaradar,distanciadeteccion) + 
                "Altura: "+this.altitud+ "\n"+"Distancia del buque enemigo: " 
                + this.Distanciabuqueenem + "\n";
        return i;
    }
    public double calculoDedistanciaMaxExterna (double distancia)
    {
        Distancia = distancia;
        alturapaso1 = Distancia*Distancia;
        alturapaso2 = Radio*2;
        alturapaso3 = alturapaso1 / alturapaso2;
        alturaAeronave= alturapaso3*1000;
        return alturaAeronave;
    }
}
