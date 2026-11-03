package com.kirin3.domain.word

/**
 * 単語の Domain Model
 */
data class Word(
    val id: String,
    val english: String,
    val japanese: String,
    val reviewFrequency: ReviewFrequency
)
