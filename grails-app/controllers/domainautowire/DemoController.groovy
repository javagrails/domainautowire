package domainautowire

class DemoController {

    def index() {
        Person p = new Person()

        render "Service: ${p.helperService?.class}"
    }
}
