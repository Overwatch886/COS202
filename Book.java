 class Book {
     String title;
     String author;
     double price;

     /*Book(String title, String author, double price) {
         this.title = title;
         this.author = author;
         this.price = price;
     }*/

     public static void main(String[] args) {
         Book biography = new Book();
         Book research_paper = new Book();
         research_paper.price = 4500;
         System.out.println("My biography costs "+biography.price);
         System.out.println("My research paper costs "+research_paper.price);
     }
 }
