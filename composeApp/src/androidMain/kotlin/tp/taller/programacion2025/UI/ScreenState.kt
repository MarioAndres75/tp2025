package tp.taller.programacion2025.UI

import tp.taller.programacion2025.domain.Character

sealed class ScreenState {

    object Loading : ScreenState()

    class ShowCharacters(val list: List<Character>) : ScreenState()
}