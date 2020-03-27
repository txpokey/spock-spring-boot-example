package example

class ExternalApiClient {
    Hello findByName(String name) {
        assert name
        new Hello(name)
    }

    Hello getDefault() {
        new Hello('world')
    }
}
