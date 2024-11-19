public class Gengar {
    private int peso;
    private String apodo;
    private boolean variacolor;
    public Gengar(String elApodo, int elPeso) {
        this.apodo = elApodo;
        this.peso = elPeso;
        this.variacolor = false;
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
    
    public void imprimirGengar(){
        System.out.println("Apodo: " + apodo + "| Peso: " + peso + "| Variacolor: " + variacolor);
    }
    
    public String getEstadoGengar() {
        return "Apodo: " + apodo + " | Peso: " + peso + " | Variacolor: " + variacolor;
    }
}