import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.*
import androidx.compose.desktop.ui.tooling.preview.Preview

@Preview
@Composable
fun examplePreview() {
    var text by remember { mutableStateOf("Hello, Wo!") }

    Button(onClick = {
        text = "Hello, Desktop!"
    }) {
        Text(text)
    }
}