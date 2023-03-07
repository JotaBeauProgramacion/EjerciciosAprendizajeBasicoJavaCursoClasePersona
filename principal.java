public class principal {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Jota");
        p1.setEdad(19);
        p1.setTelefono(609231256);
        System.out.println("Los datos de la persona es: "+p1.toString());
    }
}
