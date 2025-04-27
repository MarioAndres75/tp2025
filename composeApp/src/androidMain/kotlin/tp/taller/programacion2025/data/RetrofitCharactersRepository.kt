package tp.taller.programacion2025.data

import tp.taller.programacion2025.domain.Character
import tp.taller.programacion2025.domain.CharactersResponse
import tp.taller.programacion2025.domain.MarvelCharactersClient

class RetrofitCharactersRepository(private val apiClient: MarvelCharactersClient) :
    CharactersRepository {

    override suspend fun getCharacters(timestamp: Long, md5: String): List<Character> {
        return apiClient.getAllCharacters(timestamp, md5).toModel()
    }

    private fun CharactersResponse.toModel(): List<Character> {
        return this.characters.list.map {
            Character(
                id = it.id,
                name = it.name,
                description = it.description,
                thumbnailUrl = it.thumbnail.toUrl()
            )
        }
    }
}