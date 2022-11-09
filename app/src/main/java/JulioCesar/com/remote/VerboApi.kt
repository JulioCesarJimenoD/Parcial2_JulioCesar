package JulioCesar.com.remote

import JulioCesar.com.remote.dto.VerboDto
import retrofit2.Response
import retrofit2.http.GET

interface VerboApi {
    @GET("/verbos")
    suspend fun GetVerbos(): Response<List<VerboDto>>

}