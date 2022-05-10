package Aluno.Atividade_2;

public class Main {
    public static void main(String[] args) throws Exception {

        Author author1 = new Author("Clarice Lispector", "clarice06@gmail.com", 'F');
        Author author2 = new Author("George Orwell", "george@gmail.com", 'M');

        Book book1 = new Book("A Hora da Estrela", author1, 37.5, 5);
        Book book2 = new Book("1984", author2, 29.5);
        book2.setQty(10);

        System.out.println("\nLivros:");
        System.out.println("\nNome: " + book1.getName() + "\nQuantidade: "+book1.getQty() + "\nPreço: R$" + book1.getPrice() + "\nMétodo toString: " + book1.toString());
        System.out.println("\nNome: " + book2.getName() + "\nQuantidade: "+book2.getQty() + "\nPreço: R$" + book2.getPrice() + "\nMétodo toString: " + book2.toString());
        
        System.out.println("\nAutores:");
        System.out.println("\nNome: " + author1.getName() + "\nEmail: "+author1.getEmail() + "\nGênero: " + author1.getGender() + "\nMétodo toString: " + author1.toString());
        System.out.println("\nNome: " + author2.getName() + "\nEmail: "+author2.getEmail() + "\nGênero: " + author2.getGender() + "\nMétodo toString: " + author2.toString());

    }
}
