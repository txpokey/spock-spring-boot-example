package example.cfg


import example.ExternalApiClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile(["default","dev"])
class SpringDiSetup{

    @Bean
    ExternalApiClient externalApiClient() {
        ExternalApiClient candidate = new ExternalApiClient()
        candidate
    }

}
