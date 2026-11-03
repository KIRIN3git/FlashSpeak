package com.kirin3.domain.word

/**
 * 単語一覧取得の結果
 */
sealed interface GetWordsResult {
    /** 成功時 */
    data class Success(
        val words: List<Word>
    ) : GetWordsResult

    /** 失敗時 */
    data class Failure(
        val error: DomainError
    ) : GetWordsResult
}

/**
 * ドメインエラー
 */
sealed interface DomainError {
    /** ネットワークエラーなど */
    data object Network : DomainError
    /** その他不明なエラー */
    data object Unknown : DomainError
}
