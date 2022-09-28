package JulioCesar.com.util


sealed class Screen(val route: String){

    object RegistroArticuloScreen: Screen("RegistroScreen")
    object ConsultaArticuloScreen: Screen("ListadoScreen")
}
