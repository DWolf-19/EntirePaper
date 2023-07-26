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
    mainClass.set("com.dwolfnineteen.samples.Paper")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
