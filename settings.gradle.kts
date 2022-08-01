rootProject.name = "Yokura"

pluginManagement {
    repositories {
        maven("https://repo.defade.net/defade") {
            name = "defade"
            credentials(PasswordCredentials::class)
        }
    }
}

includeBuild("Yokura")
