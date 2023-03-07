package Ejercicios1;

public class Main
{
    public static void main(String[] args) {
       Empleado[]Vector=new Empleado[10];
       for(int i=0; i<Vector.length;i++)
       {
           int aux=(int)(Math.random()*3+1);
           if (aux==1){ Vector[i]= new Abogado();}
           if (aux==2){ Vector[i]= new Secretario();}
           if (aux==3){ Vector[i]= new Conserje();}

           System.out.println(""+Vector[i].getSalario() );
           System.out.println(""+Vector[i].getVacaciones() );
           System.out.println(""+"Empleado nº:"+i+"\t"+Vector[i].getMesVacaciones() );
       }



    }
}
