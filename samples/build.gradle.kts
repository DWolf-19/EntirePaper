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
    mainClass.set("org.dwolf19.samples.PaperDownload")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
