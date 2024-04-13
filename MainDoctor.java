class MainDoctor{
   public static void main(String[] args) {
      Doctor Oscaar = new Doctor();
      Oscaar.especialidad = "Cardiologia";
      Oscaar.edad = 26;
      Oscaar.nombre = "Oscaar";

      Oscaar.mostrarEspecialidad();
      Oscaar.mostrarEdad();
      Oscaar.mostrarNombre();
   
      Doctor Brunoo = new Doctor();
      
      Brunoo.especialidad ="Poodologo";
      Brunoo.edad  =24;
      Brunoo.nombre = "Brunoo";
      
      Brunoo.mostrarEspecialidad();
      Brunoo.mostrarEdad();
      Brunoo.mostrarNombre(); 
   }
}