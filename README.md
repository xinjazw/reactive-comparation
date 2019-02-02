# reactive-comparation
Compaction between spring 5 servlet stack vs WebFlux reactive stack

For testing, we have a rest endpoint POST /persons that accepts a json Person object and returns an object with UUID.
Gatlin is used to run the tests and generate report.

Start the app with
mvn spring-boot:run
Run tests with
./gradlew loadTest -D SIM_USERS=5000
