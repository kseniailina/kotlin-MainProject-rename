package KotlinMainProjectRename.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinMainProjectRename_HttpsGithubComKseniailinaKotlinMainProjectRenameGitRefsHeadsMaster : GitVcsRoot({
    uuid = "7eca1e26-bf24-493b-a21b-4ddee73d975c"
    name = "https://github.com/kseniailina/kotlin-MainProject-rename.git#refs/heads/master"
    url = "https://github.com/kseniailina/kotlin-MainProject-rename.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:29a36eda-5eec-4d23-bba8-3e6e5efa792f"
    }
})
