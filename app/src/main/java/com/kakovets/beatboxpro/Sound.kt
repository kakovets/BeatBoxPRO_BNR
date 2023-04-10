package com.kakovets.beatboxpro

private const val WAV = ".wav"

class Sound(val assetPath: String, var soundID: Int? = null) {
    val name = assetPath.split("/").last().removeSuffix(WAV)
}