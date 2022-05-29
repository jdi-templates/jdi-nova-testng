## JDI Nova Template
This is simple test template based on (JDI Nova)[https://github.com/jdi-testing/jdi-nova] to accelerate start of new test project</br>
It has everything you need already in place like: logging setup, reporting setup, recommended test framework structure and simple test example</br>

## How to use
1. Rename namespace from `com.jdiai` to your project (site/application) name
2. Setup your test project using TestConfig.java (or use default settings) (See [Test Configurations](#test-configurations))
3. Add your tests to src/test/java/.../tests (See [Test Examples](#test-examples))

If it is required
4. You can specify your Page Objects in src/java/.../site folder (or rename the folder) (See [Page Objects](#page-objects))
5. You can use Site class to list all your page objects in one place as singleton and init them once (See [Application class](#application-class))
6. We recommend to use business entities in your tests. Place entity classes to src/java/.../entities and create data instances in test/java/.../test/data (See [Data class](#data-class))
7. If you need custom complex elements, place them in src/java/.../custom (or rename folder)  (See [Custom elements](#custom-elements))
8. If you have preconditions/states in your tests, list them in test/java/.../states

## Test Configurations
You can specify webDriver and its capabilities
```java
DriverManager.useDriver(CHROME);
        JDIDriver.DRIVER_OPTIONS.chrome = (options)-> options.setHeadless(true);
```
or use common settings for all browsers
```java
JDIDriver.DRIVER_OPTIONS.common = (cap) -> cap.setCapability(ACCEPT_SSL_CERTS, true);
```
You also can use your own configured driver using
```java
DriverManager.useDriver(() -> { ...; return driver; });
```

## Test Examples

## Page Objects

## Application class
