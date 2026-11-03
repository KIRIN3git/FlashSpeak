package com.kirin3.data.word


import com.kirin3.domain.word.GetWordsResult
import com.kirin3.domain.word.ReviewFrequency
import com.kirin3.domain.word.Word
import com.kirin3.domain.word.WordRepository

/**
 * WordRepository の実装クラス
 *
 * ※ 現時点では API/DB の準備前のため、ダミーの固定データを返します。
 */
class WordRepositoryImpl : WordRepository {

    override suspend fun getWords(): GetWordsResult {
        // 固定のダミー単語リスト
        val dummyWords = listOf(
            Word(
                id = "1",
                english = "apple",
                japanese = "りんご",
                reviewFrequency = ReviewFrequency.HIGH
            ),
            Word(
                id = "2",
                english = "banana",
                japanese = "バナナ",
                reviewFrequency = ReviewFrequency.LOW
            ),
            Word(
                id = "3",
                english = "cherry",
                japanese = "さくらんぼ",
                reviewFrequency = ReviewFrequency.NONE
            )
        )
        return GetWordsResult.Success(words = dummyWords)
    }
}
