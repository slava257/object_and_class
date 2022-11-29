public class Main {


    public static void main(String[] args) {
        // 1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации. Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
        //2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
        //3. Написать конструкторы для обоих классов, заполняющие все поля.
        //4. Создать геттеры для всех полей автора и всех полей книги.
        //5. Создать сеттер для поля «Год публикации» у книги.
        //6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
        //
        //    Метод main не должен находиться в классах Book и Author.
        //
        //    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
        //
        //7. В том же методе main изменить год публикации одной из книг с помощью сеттера.
        Author author = new Author("Andrzej","Sapkowski");
        Book book = new Book("the witcher",author,1986);
        Author author1 = new Author("Carlos","Castaneda");
        Book book1 = new Book("Don Juan's teachings",author1,1960);
        System.out.println("(author.getName()+\" \"+author.getName()) = " + (author.getName() + " " + author.getSurname()));
        System.out.println("(book.getYearPublishing()+\" \"+book.getName()) = " + (book.getYearPublishing() + " " + book.getName()));
        System.out.println("(author1.getName()+\" \"+author1.getName()) = " + (author1.getName() + " " + author1.getSurname()));
        System.out.println("(book1.getYearPublishing()+\" \"+book1.getName()) = " + (book1.getYearPublishing() + " " + book1.getName()));
        book.setYearPublishing(1980);
        System.out.println("(book.getYearPublishing()+\" \"+book.getName()) = " + (book.getYearPublishing() + " " + book.getName()));
    }
    }
