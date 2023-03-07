package Ejercicios1;

public class Abogado extends Empleado
{
    @Override
    public int getHoras() {
        return super.getHoras()+5;
    }

    @Override
    public double getSalario() {
        return super.getSalario()+10000;
    }

    @Override
    public int getVacaciones() {
        return super.getVacaciones();
    }

    @Override
    public String getMesVacaciones() {
        return "Julio";
    }

    public String Estoy(){return "Estoy en el Tribunal";}
}
