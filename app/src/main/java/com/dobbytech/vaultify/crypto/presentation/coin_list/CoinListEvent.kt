package com.dobbytech.vaultify.crypto.presentation.coin_list

import com.dobbytech.vaultify.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}