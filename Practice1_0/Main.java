package Practice1_0;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book bk = (Book) it.next();
			System.out.print(bk.getName() + "\n");
		}

	}

}
