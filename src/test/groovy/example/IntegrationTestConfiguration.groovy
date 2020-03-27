package example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import spock.mock.DetachedMockFactory

/**
 * A configuration class of mock for the integration test.
 *
 * @author Hidetake Iwata
 */
class IntegrationTestConfiguration {
    private final detachedMockFactory = new DetachedMockFactory()

    @Bean
    ExternalApiClient externalApiClient() {
        detachedMockFactory.Mock(ExternalApiClient)
    }

    @Autowired
    ExternalApiClient externalApiClient
    @Bean
    BarService getServiceWithMockedClient(){
        assert externalApiClient
        def service = new BarService(externalApiClient)
        service
    }
}
