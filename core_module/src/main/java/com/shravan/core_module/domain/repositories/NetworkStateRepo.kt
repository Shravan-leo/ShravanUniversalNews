package com.shravan.core_module.domain.repositories

interface NetworkStateRepo {

    //it will return internet is connected or not
    fun isInternetConnected() : Boolean
}