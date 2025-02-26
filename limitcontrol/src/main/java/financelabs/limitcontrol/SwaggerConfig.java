package financelabs.limitcontrol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;

@Configuration
public class SwaggerConfig {

    // Bean to configure the group of APIs
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")  // Name of the API group
                .pathsToMatch("/api/**")  // Paths for API routes
                .build();
    }

    // Bean to configure the OpenAPI details such as title, description, and version
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API LimitControl")  // API title
                        .description("Documentation for the LimitControl API")  // API description
                        .version("1.0.0"));  // API version
    }
}
