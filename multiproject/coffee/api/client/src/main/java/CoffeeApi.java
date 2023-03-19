import retrofit2.http.GET;

public interface CoffeeApi {
    @GET("/")
    CoffeeResponse getCoffee();
}
