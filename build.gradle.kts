plugins {
    kotlin("jvm") version "1.3.31"
}

group = "guilherme.miguel"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.slf4j:slf4j-simple:1.7.26")

    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3.2")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("PASSED", "SKIPPED", "FAILED")
    }
}