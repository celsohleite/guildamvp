package dextra.com.br.mvp_guilda.ui.login.view

import dextra.com.br.mvp_guilda.domain.entity.User

interface LoginContract {

    interface Presenter{
        fun doValidateUser(user: User)
    }

    interface View {
        fun showMessage(message: String)
    }


}