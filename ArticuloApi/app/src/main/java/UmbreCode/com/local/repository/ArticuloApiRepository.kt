package UmbreCode.com.local.repository

import UmbreCode.com.remote.CodeApi
import UmbreCode.com.remote.dto.ArticuloDto
import javax.inject.Inject

class ArticuloApiRepository @Inject constructor(
    private val api: CodeApi
){
    suspend fun ArticuloApi (marca: String,descripcion: String, existencias: String): ArticuloDto {
        try {
            return api.ArticuloApi(marca,descripcion,existencias)
        }catch (e: java.lang.Exception){
            throw e
        }
    }
}