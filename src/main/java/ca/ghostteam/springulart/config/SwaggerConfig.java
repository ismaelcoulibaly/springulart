package ca.ghostteam.springulart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author     
 * @version 1.0
 * @since 2022-03-31
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {
    private static final String API_VERSION = "2.0";
    private static final String TITLE = "Springular REST API";
    private static final String DESCRIPTION = "Springular REST API";
    private static final String LICENSE = "Apache License Version 2.0";
    private static final String CONTACT_NAME = "     | Ismael Coulibaly ";
    private static final String CONTACT_URL = "https://josue-lubaki.ca";
    private static final String CONTACT_EMAIL = "  ; ismael.coulibaly@uqtr.ca;
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String DATA_TYPE = "application/json";

    /**
     * Information about the API
     * @return ApiInfo
     * */
    private ApiInfo metaData (){
        return new ApiInfoBuilder()
                .title(TITLE)
                .description(DESCRIPTION)
                .license(LICENSE)
                .contact(new Contact(CONTACT_NAME, CONTACT_URL, CONTACT_EMAIL))
                .version(API_VERSION)
                .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(metaData())
                .produces(Collections.singleton(DATA_TYPE))
                .consumes(Collections.singleton(DATA_TYPE))
                .securityContexts(Collections.singletonList(securityContexts()))
                .securitySchemes(Collections.singletonList(apiKey()))
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("ca.ghostteam.springulart"))
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/");
    }


    /**
     * Security scheme for API
     * @return ApiKey
     **/
    private ApiKey apiKey() {
        return new ApiKey(AUTHORIZATION_HEADER, AUTHORIZATION_HEADER, "header");
    }

    /**
     * Security context for API
     * @return SecurityContext
     **/
    private SecurityContext securityContexts() {
        // don't secure /auth and /api/v1/haircuts
        Pattern pattern = Pattern.compile("^(?!(/auth|/api/v1/haircuts)).*$");

        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex(pattern.pattern()))
                .build();
    }

    /**
     * Security reference for API
     * @return List<SecurityReference>
     **/
    List<SecurityReference> defaultAuth(){
        AuthorizationScope authorizationScope
                = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Collections.singletonList(new SecurityReference(AUTHORIZATION_HEADER, authorizationScopes));
    }

}
