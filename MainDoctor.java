import java.util.Scanner;
class MainDoctor{
   public static void main(String[] args) {
      Scanner op = new Scanner(System.in);
         String name;
         String specialty;
         String none;
         int age;
         int a;
            
         do {
            System.out.println("\nRegistros de doctores\n");
            System.out.println("1- Registrar a un usuario");
            System.out.println("2- Salir");
            System.out.print("Escoja alguna de las opciones:");
            a = op.nextInt();
            switch(a){
               case 1:
               System.out.print("\nIngresa tu edad: ");
               age = op.nextInt();
               none = op.nextLine();
               System.out.print("Ingrese su especialidad: ");
               specialty = op.nextLine();
               System.out.print("Ingresa tu nombre: ");
               name = op.nextLine();
                   
               Doctor Oscaar = new Doctor();
               Oscaar.edad = age;
               Oscaar.especialidad = specialty;
               Oscaar.nombre = name;
        
               Oscaar.mostrarEdad();
               Oscaar.mostrarEspecialidad();
               Oscaar.mostrarNombre();
               break;     
            }        
         } while (a==1);
      
   }
}