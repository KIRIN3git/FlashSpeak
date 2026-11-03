package com.kirin3.domain.word

/**
 * 単語データの取得・操作を行う Repository インターフェース
 */
interface WordRepository {
    /**
     * 単語一覧を取得する
     */
    suspend fun getWords(): GetWordsResult
}
