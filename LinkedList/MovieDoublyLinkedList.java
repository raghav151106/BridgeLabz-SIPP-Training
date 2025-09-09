package LinkedList;

class Movie {
    String title, director;
    int year;
    double rating;
    Movie next, prev;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieDoublyLinkedList {
    Movie head, tail;

    // Add at beginning
    void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
            return;
        }
        newMovie.next = head;
        head.prev = newMovie;
        head = newMovie;
    }

    // Add at end
    void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
            return;
        }
        tail.next = newMovie;
        newMovie.prev = tail;
        tail = newMovie;
    }

    // Remove by title
    void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title))
            temp = temp.next;
        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;
    }

    // Search by director
    void searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equals(director))
                System.out.println("Found: " + temp.title + " (" + temp.year + ")");
            temp = temp.next;
        }
    }

    // Search by rating
    void searchByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating)
                System.out.println("Found: " + temp.title + " (" + temp.year + ")");
            temp = temp.next;
        }
    }

    // Update rating
    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    // Display forward
    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        list.addAtEnd("Inception", "Nolan", 2010, 9.0);
        list.addAtBeginning("Avatar", "Cameron", 2009, 8.5);
        list.addAtEnd("Interstellar", "Nolan", 2014, 9.2);

        System.out.println("Movies Forward:");
        list.displayForward();

        System.out.println("\nMovies Reverse:");
        list.displayReverse();

        System.out.println("\nSearching by Director (Nolan):");
        list.searchByDirector("Nolan");

        System.out.println("\nUpdating Rating for Avatar:");
        list.updateRating("Avatar", 9.0);
        list.displayForward();

        System.out.println("\nRemoving Inception:");
        list.removeByTitle("Inception");
        list.displayForward();
    }
}

