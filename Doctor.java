class Doctor {
   String especialidad, nombre;
   int edad;

   Doctor() {
      System.out.println("Se esta construyendo el metodo constructor");
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