package JulioCesar.com.util


sealed class Screen(val route: String){

    object RegistroArticuloScreen: Screen("RegistroArticuloScreen")
    object ConsultaArticuloScreen: Screen("ConsultaArticuloScreen")
}
