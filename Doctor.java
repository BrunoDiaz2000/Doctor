class Doctor {
   String nombre;
   String especialidad;
   int edad;

   Doctor() {
      System.out.println("\nSe esta construyendo el metodo constructor\n");
   }
   
   public void mostrarEspecialidad() {
      System.out.println("Hola mi especialista es: " + this.especialidad);
   }
   public void mostrarNombre() {
      System.out.println("Hola soy: " + this.nombre);
   }
   public void mostrarEdad() {
      System.out.println("Mi edad es: "+this.edad);
   }
}