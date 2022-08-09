package com.pranavjayaraj.domain.repository

import com.pranavjayaraj.domain.models.ContainerRemoteResModel
import io.reactivex.Single


interface ApiRepository {
    fun getContainer(): Single<ContainerRemoteResModel>
}