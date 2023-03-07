package Ejercicios1;

public class Secretario extends Empleado
{

    @Override
    public double getSalario() {
        return super.getSalario()+5000;
    }
    public String Sec(){return "Estoy haciendo fotocopias";}
}
