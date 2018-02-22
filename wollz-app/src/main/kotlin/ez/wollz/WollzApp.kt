package ez.wollz

import ez.wollz.views.WelcomeView
import tornadofx.App

class WollzApp : App(WelcomeView::class) {

	override fun init() {
		super.init()
		//TODO: init middleware
		println("init() : Loading middleware...")
	}

}