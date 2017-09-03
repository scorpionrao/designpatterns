package creational.abstractfactory.examplebook;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern");
        IMovieFactory actionMovies = new ActionMovieFactory();
        ITollywoodMovie tAction = actionMovies.getTollywoodMovie();
        IBollywoodMovie bAction = actionMovies.getBollywoodMovie();
        System.out.println("Action Movies");
        System.out.println(tAction.movieName());
        System.out.println(bAction.movieName());

        IMovieFactory comedyMovies = new ComedyMovieFactory();
        ITollywoodMovie tComedy = comedyMovies.getTollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.getBollywoodMovie();
        System.out.println("Comedy Movies");
        System.out.println(tComedy.movieName());
        System.out.println(bComedy.movieName());
    }
}
