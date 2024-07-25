plugins {
    id("java")
    kotlin("jvm")
    application
    `maven-publish`
}

group = "com.github.codybrookshear.deckofcards"
version = "1.0.0"

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

java {
    withSourcesJar()
    withJavadocJar()
}

application {
    mainClass.set("MainKt")
}

publishing {
    publications {
        create<MavenPublication>("mavenKotlin") {
            from(components["kotlin"])
        }
    }
    repositories {
        maven {
            name = "DeckOfCards"
            url = uri("https://github.com/codybrookshear/DeckOfCards")
            credentials {
                username = project.findProperty("mavenUser") as String? ?: System.getenv("MAVEN_USER")
                password = project.findProperty("mavenPassword") as String? ?: System.getenv("MAVEN_PASSWORD")
            }
        }
    }
}