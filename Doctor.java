class Doctor {
   String especialidad, nombre;
   int edad;

   public void mostrarEspecialidad() {
      System.out.println("Hola soy especialista en : " + this.especialidad);
   }
   public void mostrarNombre() {
      System.out.println("Hola soy: " + this.nombre);
   }
   public void mostrarEdad() {
      System.out.println("Mi edad es: "+this.edad);
   }
}