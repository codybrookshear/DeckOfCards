plugins {
    id("java")
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.9.3")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}