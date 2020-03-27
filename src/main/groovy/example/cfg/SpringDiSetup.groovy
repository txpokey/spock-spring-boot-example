package example.cfg

import example.BarService
import example.ExternalApiClient
import org.springframework.beans.factory.annotation.Autowired
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

    @Autowired
    ExternalApiClient externalApiClient

    @Bean
    BarService getServiceWithRealClient(){
        assert externalApiClient
        def service = new BarService(externalApiClient)
        service
    }
}
