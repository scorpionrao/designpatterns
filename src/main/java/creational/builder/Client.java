package creational.builder;

import java.util.List;

public class Client {

    ManagingDirector1 director;

    /**
     * Client has a dependency on managing director.
     * Managing director encapsulates the builders.
     */
    Client(ManagingDirector1 director) {
        this.director = director;
    }

    /**
     * Client has a dependency on builders.
     * Managing director no longer hides the builders from client.
     */
    Client(List<IProductBuilder> builderList) {
        this.director = new ManagingDirector1(builderList);
    }

    public String buildProductAndPrint() {
        return director.createUsingBuilderPattern().toString();
    }
}
