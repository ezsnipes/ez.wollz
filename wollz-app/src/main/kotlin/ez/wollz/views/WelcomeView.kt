package ez.wollz.views


import javafx.scene.paint.Color
import javafx.scene.text.Font
import javafx.scene.text.TextAlignment
import tornadofx.*

class WelcomeView : View() {

	override val root = vbox {
		minWidth = 500.0
		minHeight = 250.0
		isFillWidth = true
		isFillWidth = true

		textflow {
			textAlignment = TextAlignment.CENTER
			isFillWidth = true

			text("Hello, ") {
				fill = Color.web("#333333")
				font = Font(18.0)
			}
			text("World!") {
				fill = Color.ORANGE
				font = Font(16.0)
			}
			text("Hello, ") {
				fill = Color.web("#333333")
				font = Font(18.0)
			}
		}
	}

}