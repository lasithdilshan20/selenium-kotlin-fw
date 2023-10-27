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
    implementation("io.github.bonigarcia:webdrivermanager:5.0.3")
    implementation("org.slf4j:slf4j-simple:1.7.32")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}
