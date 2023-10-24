plugins {
    kotlin("jvm") version "1.9.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.13.1")
    testImplementation(kotlin("test"))
    implementation("org.seleniumhq.selenium:selenium-java:4.14.1")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}
