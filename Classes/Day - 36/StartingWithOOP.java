class AC {
    boolean isOn;
    private int temperature;
    String mode;

    AC(boolean isOn, int temperature, String mode){
        this.isOn = isOn;
        this.temperature = temperature;
        this.mode = mode;
    }

    public void switchButton(){
        this.isOn = !isOn;
    }

    public void increaseTemp(){
        if(isOn){
            if(temperature < 30){
                temperature++;
            }else{
                System.out.println("Deshdrohi! Pakistan chale jaa!");
            }
        }else{
            this.isOn = !isOn;
        }
    }

    public void decreaseTemp(){
        if(isOn){
            if(temperature > 20){
                temperature--;
            }else{
                System.out.println("Deshdrohi! Pakistan chale jaa!");
            }
        }else{
            this.isOn = !isOn;
        }
    }

    // Getter Setter
    public int getTemperature(){
        return this.temperature;
    }
    public void setTemperature(int temp){
        this.temperature = temp;
    }
}

public class StartingWithOOP {
    public static void main(String[] args) {
        AC Voltas = new AC(true, 21, "Power Chill"); // Object Created 
        System.out.println(Voltas.isOn);
        System.out.println(Voltas.getTemperature());
        Voltas.setTemperature(23);
        System.out.println(Voltas.getTemperature());
        Voltas.isOn = true;
        System.out.println(Voltas.isOn);
        Voltas.switchButton();
        System.out.println(Voltas.isOn);
        System.out.println(Voltas.mode);
    }
}