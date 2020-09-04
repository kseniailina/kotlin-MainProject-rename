package KotlinMainProjectRename

import KotlinMainProjectRename.buildTypes.*
import KotlinMainProjectRename.vcsRoots.*
import KotlinMainProjectRename.vcsRoots.KotlinMainProjectRename_HttpsGithubComKseniailinaKotlinMainProjectRenameGitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "25727f81-7246-4f35-a8ff-4b2d58c345fc"
    id("KotlinMainProjectRename")
    parentId("_Root")
    name = "Kotlin MainProject Rename"

    vcsRoot(KotlinMainProjectRename_HttpsGithubComKseniailinaKotlinMainProjectRenameGitRefsHeadsMaster)

    buildType(KotlinMainProjectRename_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_14"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "${KotlinMainProjectRename_HttpsGithubComKseniailinaKotlinMainProjectRenameGitRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
