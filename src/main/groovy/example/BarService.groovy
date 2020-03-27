package example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BarService {
    private final ExternalApiClient client

    BarService(@Autowired ExternalApiClient client) {
        this.client = client
        assert client
    }

    Hello hello(String name) {
        def hello = client.findByName(name)
        hello
    }
}
