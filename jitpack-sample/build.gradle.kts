plugins {
    id("java")
    application
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.codybrookshear:DeckOfCards:f91d1ddb")
}

application {
    mainClass.set("Main")
}