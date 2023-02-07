public class ejercicio9{

    public static void main(String[] args){
        Cliente cliente1 = new Cliente();

        cliente1.setEdad(30);
        cliente1.setNombre("Pablo");
        cliente1.setTelefono(600);
        cliente1.setCredito(10000);

        System.out.println("Edad de "+ cliente1.getEdad());
        System.out.println("Nombre: "+cliente1.getNombre());
        System.out.println("Telf: "+cliente1.getTelefono());
        System.out.println("Credito: "+cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();

        trabajador1.setEdad(40);
        trabajador1.setNombre("Jose");
        trabajador1.setTelefono(700);
        trabajador1.setSalario(2000);

        System.out.println("Edad de "+trabajador1.getEdad());
        System.out.println("Nombre: "+trabajador1.getNombre());
        System.out.println("Telf: "+trabajador1.getTelefono());
        System.out.println("Sueldo de: "+trabajador1.getSalario());

    } 

}

class Persona{

    private int edad;
    private String nombre;
    private int telefono;
    
    public void setEdad(int edad){
        this.edad = edad;

    }

    public int getEdad(){
        return this.edad;

    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public String getNombre(){
        return this.nombre;

    }

    public void setTelefono(int telefono){
        this.telefono = telefono;

    }

    public int getTelefono(){
        return this.telefono;

    }
}


class Cliente extends Persona{

    private int credito;

    public void setCredito(int credito){
        this.credito = credito;

    }

    public int getCredito(){
        return this.credito;

    }


}

class Trabajador extends Persona{

    private int salario;

    public void setSalario(int salario){
        this.salario = salario;

    }

    public int getSalario(){
        return this.salario;

    }


}