
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties("coffee.api")
public class CoffeeApiClientProperties {
    @URL
    @NotBlank
    public String baseUrl;
}
