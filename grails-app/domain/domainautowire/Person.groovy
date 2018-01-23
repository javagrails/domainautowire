package domainautowire

class Person {
    HelperService helperService
    String name

    static transients = ['helperService']

    static mapping = {
        autowire true
    }
}
