plugins {
    id("java")
}

group = "org.test"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.codybrookshear:DeckOfCards:-SNAPSHOT")
}
