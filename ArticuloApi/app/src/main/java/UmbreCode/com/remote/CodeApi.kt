package UmbreCode.com.remote

import UmbreCode.com.remote.dto.ArticuloDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CodeApi {
    @GET("api/Articulos")
    suspend fun ArticuloApi(
        @Query("marca") marca: String,
        @Query("descripcion") descripcion: String,
        @Query("existencias") existencias: String
    ):ArticuloDto
}