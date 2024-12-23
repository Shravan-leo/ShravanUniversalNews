package com.shravan.presentation.utility

import android.content.Context
import com.shravan.R
import com.shravan.core_module.utility.ErrorType

//retrieve the error message based on the type
fun getErrorMessage(mContext: Context, errorType: ErrorType): String {
    return when (errorType) {
        ErrorType.NETWORK_ERROR -> mContext.getString(R.string.internet_error)
        ErrorType.DATA_NOT_AVAILABLE -> mContext.getString(R.string.articles_not_found_error)
        ErrorType.SERVER_ERROR -> mContext.getString(R.string.unexpected_error)
    }
}