plugins {
    kotlin("jvm")
}

kotlin {
    sourceSets {
        @Suppress("UNUSED_VARIABLE")
        val main by getting {
            dependencies {
                api(project(":kenet-dsl"))
                implementation(kotlin("reflect"))
            }
        }

        @Suppress("UNUSED_VARIABLE")
        val test by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}