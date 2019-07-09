package reyst.gsihome.research.repository

import reyst.gsihome.research.core.Repo
import reyst.gsihome.research.repository.core.IRepoDto

data class GitHubRepo(
    override val id: Int,
    override val name: String,
    override val fullName: String,
    override val isChecked: Boolean
): Repo

fun IRepoDto.toDomain() = GitHubRepo(id, name, fullName, isChecked)
fun Collection<IRepoDto>.toDomain() = map { it.toDomain() }