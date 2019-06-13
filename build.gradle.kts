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
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3.2")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform { }
}