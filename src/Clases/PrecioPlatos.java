package Clases;

public class PrecioPlatos {

    private int numero;
    private String Fecha;
    private String Nombre;
    private String Direccion;
    private String Entrada;
    private String Plato;
    private String Bebidas;
    private int NumeroEntradas;
    private int NumeroPlatos;
    private int NumeroBebidas;
    private String Descripcion;

    public int getNumeroBebidas() {
        return NumeroBebidas;
    }

    public void setNumeroBebidas(int NumeroBebidas) {
        this.NumeroBebidas = NumeroBebidas;
    }
    
    public int getNumeroEntradas() {
        return NumeroEntradas;
    }

    public void setNumeroEntradas(int NumeroEntradas) {
        this.NumeroEntradas = NumeroEntradas;
    }

    public int getNumeroPlatos() {
        return NumeroPlatos;
    }

    public void setNumeroPlatos(int NumeroPlatos) {
        this.NumeroPlatos = NumeroPlatos;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEntrada() {
        return Entrada;
    }

    public void setEntrada(String Entrada) {
        this.Entrada = Entrada;
    }

    public String getPlato() {
        return Plato;
    }

    public void setPlato(String Plato) {
        this.Plato = Plato;
    }

    public String getBebidas() {
        return Bebidas;
    }

    public void setBebidas(String Bebidas) {
        this.Bebidas = Bebidas;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public Double PrecioPlatos(){
        double Precio = 0;
        
        if (getPlato().equalsIgnoreCase("Arroz con pollo")) {
            Precio = 10.50;
        }else{
            if (getPlato().equalsIgnoreCase("Salchipapa clasica")) {
                Precio = 9.00;
            }else{
                if (getPlato().equalsIgnoreCase("Arroz a la cubana")) {
                    Precio = 8.00;
                }else{
                    if (getPlato().equalsIgnoreCase("Tortilla de verduras")) {
                        Precio = 8.00;
                    }else{
                        if (getPlato().equalsIgnoreCase("Pescado frito")) {
                            Precio = 10.00;
                        }else{
                            if (getPlato().equalsIgnoreCase("Higado a la plancha")) {
                                Precio = 8.50;
                            }else{
                                if (getPlato().equalsIgnoreCase("Pollada")) {
                                    Precio = 10.00;
                                }else{
                                    if (getPlato().equalsIgnoreCase("Aji de gallina")) {
                                        Precio = 9.50;
                                    }else{
                                        if (getPlato().equalsIgnoreCase("Suprema de pollo")) {
                                            Precio = 10.00;
                                        }else{
                                            if (getPlato().equalsIgnoreCase("Adobo de pollo")) {
                                                Precio = 10.00;
                                            }else{
                                                if (getPlato().equalsIgnoreCase("Milanesa de pollo  con papas fritas")) {
                                                    Precio = 10.00;
                                                }else{
                                                    if (getPlato().equalsIgnoreCase("Mondonguito a la italiana")) {
                                                        Precio = 9.50;
                                                    }else{
                                                        if (getPlato().equalsIgnoreCase("Tallarines verdes con filete de pollo")) {
                                                            Precio = 10.50;
                                                        }else{
                                                            if (getPlato().equalsIgnoreCase("Picante de carne con platano")) {
                                                                Precio = 10.00;
                                                            }else{
                                                                if (getPlato().equalsIgnoreCase("Estofado de pollo")) {
                                                                    Precio = 10.00;
                                                                }else{
                                                                    if (getPlato().equalsIgnoreCase("Asado de carne con pure de papas")) {
                                                                        Precio = 9.50;
                                                                    }else{
                                                                        if (getPlato().equalsIgnoreCase("Pollo al horno con ensalada rusa")) {
                                                                            Precio = 10.50;
                                                                        }else{
                                                                            if (getPlato().equalsIgnoreCase("Arroz con chancho")) {
                                                                                Precio = 10.00;
                                                                            }else{
                                                                                if (getPlato().equalsIgnoreCase("Olluquito a lo pobre")) {
                                                                                    Precio = 10.00;
                                                                                }else{
                                                                                    if (getPlato().equalsIgnoreCase("Pollo a la norteña con frejoles")) {
                                                                                     Precio = 10.50;   
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return Precio;
    }
    
    public double PrecioBebidas(){
        double bebidas = 0;
        
        if (getBebidas().equalsIgnoreCase("Coca cola 500ml")) {
            bebidas = 3.50;
        }else{
            if (getBebidas().equalsIgnoreCase("Inca cola 500ml")) {
                bebidas = 3.50;
            }else{
                if (getBebidas().equalsIgnoreCase("Pepsi 500ml")) {
                    bebidas = 3.00;
                }else{
                    if (getBebidas().equalsIgnoreCase("Sin Bebida")) {
                        bebidas = 0.00;
                    }
                }
            }
        }
        return bebidas;
    }
    
    public double Total(){ 
        return (PrecioPlatos() * getNumeroPlatos()) + (PrecioBebidas() * getNumeroBebidas());
    }
    
}
