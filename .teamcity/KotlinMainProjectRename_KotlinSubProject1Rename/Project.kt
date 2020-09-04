package KotlinMainProjectRename_KotlinSubProject1Rename

import KotlinMainProjectRename_KotlinSubProject1Rename.buildTypes.*
import KotlinMainProjectRename_KotlinSubProject1Rename.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    uuid = "052d3d4e-74b9-4cde-ab03-141a00a4ea9d"
    id("KotlinMainProjectRename_KotlinSubProject1Rename")
    parentId("KotlinMainProjectRename")
    name = "Kotlin SubProject1 Rename"

    vcsRoot(KotlinMainProjectRename_KotlinSubProject1Rename_HttpsGithubComKseniailinaKotlinSubProject1renameGitRefsHeadsMaster)

    buildType(KotlinMainProjectRename_KotlinSubProject1Rename_Build)
})
