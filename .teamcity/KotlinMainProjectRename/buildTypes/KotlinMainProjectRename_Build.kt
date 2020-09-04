package KotlinMainProjectRename.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.freeDiskSpace
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinMainProjectRename_Build : BuildType({
    uuid = "900ac98a-54f6-4e09-b887-f638cd85ebcf"
    name = "Build"

    vcs {
        root(KotlinMainProjectRename.vcsRoots.KotlinMainProjectRename_HttpsGithubComKseniailinaKotlinMainProjectRenameGitRefsHeadsMaster)
    }

    triggers {
        vcs {
        }
    }

    features {
        freeDiskSpace {
            requiredSpace = "7gb"
            failBuild = false
        }
    }
})
