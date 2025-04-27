package tp.taller.programacion2025.data

import tp.taller.programacion2025.domain.Character

interface CharactersRepository {
    suspend fun getCharacters(timestamp: Long, md5: String): List<Character>
}