plugins {
    id("java")
    application
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.codybrookshear:deckofcards:1.0.1")
}

application {
    mainClass.set("Main")
}