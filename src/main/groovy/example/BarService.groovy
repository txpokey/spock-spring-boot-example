package example

import org.springframework.stereotype.Service

//@Service
class BarService {
    final ExternalApiClient client

    BarService(ExternalApiClient client) {
        this.client = client
        assert client
    }

    Hello hello(String name) {
        def hello = client.findByName(name)
        hello
    }
}
