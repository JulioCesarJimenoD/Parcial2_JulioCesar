package JulioCesar.com.repository

import JulioCesar.com.remote.VerboApi
import JulioCesar.com.remote.dto.VerboDto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class VerboRepository @Inject constructor(
    private val api: VerboApi
) {
    suspend fun getVerbos(): List<VerboDto> {
        return withContext(Dispatchers.IO) {
            val response = api.GetVerbos()
            response.body() ?: emptyList()
        }
    }
}