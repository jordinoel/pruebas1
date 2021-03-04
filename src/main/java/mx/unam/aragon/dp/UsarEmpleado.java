package mx.unam.aragon.dp;
public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1= new Empleado(1, "sistemas", 45000.0f, 15);
        emp1.setNombre("Juan jose");
        emp1.setApPaterno("García");
        emp1.setApMaterno("Bolaños");
        emp1.setEdad(24);
        emp1.setCurp("GABJ121212HDFTR2");
    }
}
