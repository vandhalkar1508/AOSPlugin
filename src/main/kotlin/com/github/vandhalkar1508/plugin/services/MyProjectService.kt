package com.github.vandhalkar1508.plugin.services

import com.intellij.openapi.project.Project
import com.github.vandhalkar1508.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
