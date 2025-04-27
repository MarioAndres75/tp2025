package tp.taller.programacion2025

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform