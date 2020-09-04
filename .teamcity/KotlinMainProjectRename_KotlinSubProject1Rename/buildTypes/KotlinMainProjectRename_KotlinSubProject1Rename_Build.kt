package KotlinMainProjectRename_KotlinSubProject1Rename.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinMainProjectRename_KotlinSubProject1Rename_Build : BuildType({
    uuid = "ac0d5d21-4c8d-4e5c-8ab7-5fa9a802cb9b"
    name = "Build"

    vcs {
        root(KotlinMainProjectRename_KotlinSubProject1Rename.vcsRoots.KotlinMainProjectRename_KotlinSubProject1Rename_HttpsGithubComKseniailinaKotlinSubProject1renameGitRefsHeadsMaster)
    }

    steps {
        script {
            scriptContent = "echo 'hello'"
        }
    }

    triggers {
        vcs {
        }
    }
})
