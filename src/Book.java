
public class Book {
	/**
	 * The Book class represents a Book
	 * It provides a method that allows the pages to be turned
	 * until there are no more pages.
	 */
	private int currentPage;//variable as integer that represents the current page
	private int numPages;//variable as integer the represents the total number of pages
	
	public Book(int _numPages){//sets the argument entered as the variable numPages.
	numPages=_numPages;
	}
	public void setcurrentPage(){//sets the currentPage to initially start as 1
		currentPage=1;
	}
	
	public int getcurrentPage(){//Accessor method
		return currentPage;
	}
	
	public void nextPage(){//if current pages are less than the number page it adds one
		if (currentPage < numPages){
			currentPage++;
			System.out.println(currentPage);
			do{
				nextPage();
			}while (currentPage < numPages);//and loops this under the same conditions
	} else{
				System.out.println("You have finished the book.");//or else it tells you that the book is finished.
				System.out.println("Congratulations!");
				
		}
		
	
		}
	
	}


