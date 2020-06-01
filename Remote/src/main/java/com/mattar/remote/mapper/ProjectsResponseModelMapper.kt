package com.mattar.remote.mapper

import com.mattar.data.model.ProjectEntity
import com.mattar.remote.model.ProjectModel

open class ProjectsResponseModelMapper :
    ModelMapper<ProjectModel, ProjectEntity> {

    override fun mapFromModel(model: ProjectModel): ProjectEntity {
        return ProjectEntity(
            model.id, model.name, model.full_name,
            model.stargazers_count.toString(), model.created_at, model.owner.login,
            model.owner.avatar_url, false
        )
    }
}
