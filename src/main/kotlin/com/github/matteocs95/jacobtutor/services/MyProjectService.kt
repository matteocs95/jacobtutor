package com.github.matteocs95.jacobtutor.services

import com.intellij.openapi.project.Project
import com.github.matteocs95.jacobtutor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
