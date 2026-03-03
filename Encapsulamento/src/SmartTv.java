public class SmartTv {
    private String marca, modelo;
    private int volume;

    public SmartTv(){ // SmartTv obj1 = new SmatTv()

    }
    public SmartTv(String marca, String modelo, int volume){
        this.marca = marca;
        this.modelo = modelo;
        this.setVolume(volume);
    }
    // setters e getters
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }
    public int getVolume(){
        return this.volume;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        if (modelo.length() <= 30){
            this.modelo = modelo;
        }
        else System.out.println("Modelo inválido");
    }
    public String getModelo(){
        return this.modelo;
    }
}