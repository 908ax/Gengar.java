public class Gengar {
    private int peso;
    private String apodo;
    private boolean variacolor;
    private boolean gigante;
    public Gengar(String elApodo, int elPeso) {
        this.apodo = elApodo;
        this.peso = elPeso;
        this.variacolor = false;
        this.gigante = true;
    }
    
    public boolean isGigante() {
        return gigante;
    }
    
    public String getApodo() {
        return apodo;
    }
    
    public int getPeso() {
        return peso;
    }

    public boolean isVariacolor() {
        return variacolor;
    }

    public void setApodo(String nuevoApodo) {
        this.apodo = nuevoApodo;
    }

    public void engordar(int comida) {
        this.peso += comida;
    }

    public void alternarVariacolor() {
        this.variacolor = !this.variacolor;
    }
    
    public void alternarGigante() {
        this.gigante = !this.gigante;
    }
    
    public void imprimirGengar(){
        System.out.println(getEstadoGengar());
    }
    
    public String getEstadoGengar() {
        String estadoVariacolor;
        String tamaño;
        if (variacolor) {
            estadoVariacolor = "Verdadero";
            } else {
            estadoVariacolor = "Falso";
        }
        
        if (gigante) {
            tamaño = "Verdadero";
            } else {
            tamaño = "Falso";
        }
        
        return "Apodo: " + apodo + " | Peso: " + peso + " | Variacolor: " + estadoVariacolor + " | Es gigante: " + tamaño;
    }
}