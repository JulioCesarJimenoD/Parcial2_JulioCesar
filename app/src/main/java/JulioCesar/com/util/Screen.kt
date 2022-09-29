package JulioCesar.com.util


sealed class Screen(val route: String){

    object RegistroScreen: Screen("RegistroArticuloScreen")
    object ConsultaScreen: Screen("ConsultaArticuloScreen")
}
