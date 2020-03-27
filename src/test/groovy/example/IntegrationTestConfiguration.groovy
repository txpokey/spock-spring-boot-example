package example


import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Profile
import spock.mock.DetachedMockFactory

/**
 * A configuration class of mock for the integration test.
 *
 * @author Hidetake Iwata
 */
@Profile("mockIntegration")
class IntegrationTestConfiguration {
    private final detachedMockFactory = new DetachedMockFactory()

    @Bean
    ExternalApiClient externalApiClient() {
        detachedMockFactory.Mock(ExternalApiClient)
    }

}
