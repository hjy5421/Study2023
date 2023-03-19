
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Configuration
@EnableConfigurationProperties(CoffeeApiClientProperties.class)
public class CoffeeApiClientAutoConfiguration {
    @Bean
    public CoffeeApi coffeeApi(CoffeeApiClientProperties properties){
        return new Retrofit
                .Builder()
                .baseUrl(properties.baseUrl)
                .addConverterFactory(JacksonConverterFactory.create(new ObjectMapper()))
                .build()
                .create(CoffeeApi.class);
    }
}

