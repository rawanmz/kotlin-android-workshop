include(":app",
        ":app1",
        ":app2",
        ":app3",
        ":app4",
        ":app5",
        ":app6",
        ":common")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    resolutionStrategy {
        eachPlugin {
            if ("com.android" in requested.id.id) {
                useModule("com.android.tools.build:gradle:${requested.version}")
            }
        }
    }
}