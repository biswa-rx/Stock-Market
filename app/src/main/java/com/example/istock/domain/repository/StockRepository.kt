package com.example.istock.domain.repository

import com.example.istock.domain.model.CompanyInfo
import com.example.istock.domain.model.CompanyListing
import com.example.istock.domain.model.IntradayInfo
import com.example.istock.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}