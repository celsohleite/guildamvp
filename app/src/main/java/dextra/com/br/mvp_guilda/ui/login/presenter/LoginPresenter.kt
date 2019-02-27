package dextra.com.br.mvp_guilda.ui.login.presenter

import dextra.com.br.mvp_guilda.domain.entity.User
import dextra.com.br.mvp_guilda.model.RepositorioLogin
import dextra.com.br.mvp_guilda.ui.login.view.LoginContract

class LoginPresenter (private val view : LoginContract.View): LoginContract.Presenter {

    private var login: RepositorioLogin = RepositorioLogin()

    override fun doValidateUser(user: User) {
        val loginSucess = login.doValidateUser(user)

        if(loginSucess){
            view.showMessage("Usuário logado com sucesso!")
        }else{
            view.showMessage("Usuário ou Senha inválida!")
        }
    }

}