package com.example.ikant.androidApp

class UnmotivatorMachine {

    val unmotivationalQuotes: List<CharSequence> = listOf(
        "Não sabendo que era impossível, foi lá e soube.",
        "Se não deu errado é porque ainda não acabou.",
        "Anos ruins se vão, para que piores possam vir.",
        "O recomeço é a oportunidade para um novo fracasso.",
        "Nunca esqueça que você é limitado.",
        "Lutar talvez, vencer nunca, desistir sempre.",
        "Nunca deixe que estraguem seu dia, você consegue fazer isso sozinho.",
        "O começo é difícil, mas o final é pior.",
        "Agora que já deu errado, tem tudo pra piorar.",
        "Dificuldades preparam pessoas comuns para fracassos extraordinários.",
        "Lutando como nunca, perdendo como sempre",
        "Na vida você tem que apanhar para aprender que vai viver apanhando",
        "A distância entre o sonho e a realidade se chama ilusão.",
        "O não você já tem, agora falta a humilhação.",
        "Nada é em vão, tudo vem pra te decepcionar",
        "Pessoas limitadas perguntam se vão conseguir, pessoas vencedoras perguntam o que vão fazer para conseguir. Você se pergunta porque não conseguiu."
    )

    fun unmotivate(): CharSequence {
        return unmotivationalQuotes.random()
    }
}