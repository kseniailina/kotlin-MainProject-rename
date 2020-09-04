package KotlinMainProjectRename.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.freeDiskSpace
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinMainProjectRename_Build : BuildType({
    uuid = "963d64e1-9682-41e1-b125-7f0543854320"
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
