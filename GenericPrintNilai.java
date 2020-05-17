public class GenericPrintNilai {
    
   // Metoda main
   public static void main(String[] args) {
 
      // Deklarasi dan pemberian nilai awal ke variabel
      Integer varInt = 8652339;
      Double varDouble = 96342.7656;
      Character varChar = 'H';
      String varString = "Belajar Java.";
 
      System.out.println();
      System.out.println("Nilai-nilai yang dicetak:");
 
      // Memanggil generic method print
      print(varInt);
      print(varDouble);
      print(varChar);
      print(varString);        
   }
 
   // Generic method untuk mencetak nilai berbegai tipe
   public static <T> void print(T nilai) {
      System.out.println(nilai);
   }
}



