// Data store for user and web information

package com.zell.webmark;
import com.zell.webmark.categories.User;
import com.zell.webmark.categories.Webmark;
import com.zell.webmark.categories.UserWebmark;
import com.zell.webmark.constants.BookGenre;
import com.zell.webmark.constants.Gender;
import com.zell.webmark.constants.MovieGenre;
import com.zell.webmark.constants.UserType;
import com.zell.webmark.managers.UserManager;
import com.zell.webmark.managers.WebmarkManager;



public class DataStore {

    /*
     * Defaults for each item
     */
    public static final int TOTAL_USER_COUNT = 5;
    public static final int WEBMARK_TYPES_COUNT = 3;
    public static final int WEBMARK_COUNT_PER_TYPE = 5;
    public static final int USER_WEBMARK_LIMIT = 5;



    /*
     * Initiates instances of Users, Webmarks, and UserWebmarks
     */
    private static User[] users = new User[TOTAL_USER_COUNT];

    // Getter method for retrieving users
    public static User[] getUsers() {
        return users;
    }

    //Getter method for retrieving bookmark

    private static Webmark[][] webmarks = new Webmark[WEBMARK_TYPES_COUNT][WEBMARK_COUNT_PER_TYPE];
    public static Webmark[][] getWebmarks() {
        return webmarks;
    }

    private static UserWebmark[] userWebmarks = new UserWebmark[TOTAL_USER_COUNT * USER_WEBMARK_LIMIT];
    private static int webmarkIndex;
    //Loads data into data store
    public static void loadData() {
        loadUsers(); // Loads users
        loadWeblinks();
        loadMovies();
        loadBooks();

    }



    /* Loads user data- reference txt file for detailed info*/
    private static void loadUsers() {
        users[0] = UserManager.getInstance().createUser(1000,	"user0@semanticsquare.com",	"test",
                "John",	"M", Gender.MALE, UserType.USER);
        users[1] = UserManager.getInstance().createUser(1001,	"user1@semanticsquare.com",	"test",
                "Sam",	"M",
                Gender.MALE, UserType.USER);
        users[2] = UserManager.getInstance().createUser(1002,	"user2@semanticsquare.com",	"test",
                "Anita",	"M", Gender.FEMALE,	UserType.EDITOR);
        users[3] = UserManager.getInstance().createUser(1003,	"user3@semanticsquare.com",	"test",
                "Sara",	"M",	Gender.FEMALE,	UserType.EDITOR);
        users[4] = UserManager.getInstance().createUser(1004,	"user4@semanticsquare.com",	"test",
                "Dheeru",	"M",	Gender.MALE,	UserType.CHIEF_EDITOR);
    }

    // Loads bookmark data
    // Call singleton instance for weblink
    private static void loadWeblinks(){
        webmarks[0][0] = WebmarkManager.getInstance().createWebLink(2000,	"Taming Tiger, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",	"http://www.javaworld.com");
        webmarks[0][1] = WebmarkManager.getInstance().createWebLink(2001,
                "How do I import a pre-existing Java project into Eclipse and get up and running?",
                "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running",
                "http://www.stackoverflow.com");
        webmarks[0][2] = WebmarkManager.getInstance().createWebLink(2002,	"Interface vs Abstract Class",
                "http://mindprod.com/jgloss/interfacevsabstract.html",	"http://mindprod.com");
        webmarks[0][3] = WebmarkManager.getInstance().createWebLink(2003,	"NIO tutorial by Greg Travis",
                "http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf",	"http://cs.brown.edu");
        webmarks[0][4] = WebmarkManager.getInstance().createWebLink(2004,	"Virtual Hosting and Tomcat",
                "http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html",	"http://tomcat.apache.org");
    }

    // Loads Movies
    private static void loadMovies(){
        webmarks[1][0] = WebmarkManager.getInstance().createMovie(3000,	"Citizen Kane",	"", 1941,
                new String[] {"Orson Welles","Joseph Cotten"},	new String[] {"Orson Welles"}, MovieGenre.CLASSICS,	8.5);
        webmarks[1][1] = WebmarkManager.getInstance().createMovie(3001,	"The Grapes of Wrath",	"",1940,
                new String[] {"Henry Fonda" ,"Jane Darwell"},	new String[] {"John Ford"},	MovieGenre.CLASSICS,	8.2);
        webmarks[1][2] = WebmarkManager.getInstance().createMovie(3002,	"A Touch of Greatness",
                "",2004,	new String[] {"Albert Cullum"},	new String[] {"Leslie Sullivan"},	MovieGenre.DOCUMENTARIES,	7.3);
        webmarks[1][3] = WebmarkManager.getInstance().createMovie(3003,	"The Big Bang Theory",	"",2007,
                new String[]{"Kaley Cuoco", "Jim Parsons"},	new String[]{"Chuck Lorre","Bill Prady"},	MovieGenre.TV_SHOWS,	8.7	);
        webmarks[1][4] = WebmarkManager.getInstance().createMovie(3004,	"Ikiru",	"",1952,
                new String[] {"Takashi Shimura","Minoru Chiaki"},	new String[] {"Akira Kurosawa"}, MovieGenre.FOREIGN_MOVIES,	8.4);

    }

    //Loads Books
    private static void loadBooks() {
        webmarks[2][0] = WebmarkManager.getInstance().createBook(4000,	"Walden",	1854,
                "Wilder Publications",	new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY,	4.3);
        webmarks[2][1] = WebmarkManager.getInstance().createBook(4001,	"Self-Reliance and Other Essays",
                1993,	"Dover Publications",	new String[] {"Ralph Waldo Emerson"},	BookGenre.PHILOSOPHY,	4.5);
        webmarks[2][2] = WebmarkManager.getInstance().createBook(4002,	"Light From Many Lamps",	1988,
                "Touchstone",	new String[] {"Lillian Eichler Watson"},	BookGenre.PHILOSOPHY,	5.0);
        webmarks[2][3] = WebmarkManager.getInstance().createBook(4003,	"Head First Design Patterns",	2004,
                "O'Reilly Media",	new String[] {"Eric Freeman","Bert Bates","Kathy Sierra","Elisabeth Robson"},	BookGenre.TECHNICAL,	4.5);
        webmarks[2][4] = WebmarkManager.getInstance().createBook(4004,	"Effective Java Programming Language Guide",
                2007,	"Prentice Hall",	new String[]{"Joshua Bloch"},	BookGenre.TECHNICAL,	4.9);

    }

    public static void add(UserWebmark userWebmark) {
    userWebmarks[webmarkIndex] = userWebmark;
    webmarkIndex++;
    }
}
