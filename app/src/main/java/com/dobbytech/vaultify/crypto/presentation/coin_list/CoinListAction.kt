package com.dobbytech.vaultify.crypto.presentation.coin_list

import com.dobbytech.vaultify.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}