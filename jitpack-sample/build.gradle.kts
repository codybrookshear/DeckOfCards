plugins {
    id("java")
}

group = "org.test"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.codybrookshear:DeckOfCards:f91d1ddb")
}
