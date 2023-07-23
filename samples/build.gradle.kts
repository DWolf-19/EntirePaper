plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":lib"))
}

application {
    mainClass.set("org.dwolf19.samples.Paper")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
