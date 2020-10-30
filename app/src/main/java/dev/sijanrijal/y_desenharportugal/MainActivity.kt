package dev.sijanrijal.y_desenharportugal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import dev.sijanrijal.y_desenharportugal.ui.Y_DesenharPortugalTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppUI {
                UpperHalf()
            }
        }
    }
}

@Composable
fun AppUI(
    upperHalfContent: @Composable () -> Unit,
) {
    Y_DesenharPortugalTheme {
        Surface(
            color = MaterialTheme.colors.surface,
            contentColor = contentColorFor(color = MaterialTheme.colors.surface),
        ) {
            Column (
                modifier = Modifier.fillMaxSize()
            ) {
                Column (
                    modifier = Modifier.weight(1f)
                ) {
                    upperHalfContent()
                }
                BottomHalf()
            }

        }
    }
}

@Composable
fun UpperHalf() {
    val smallLettersStyle = MaterialTheme.typography.overline
    Column {
        Divider(color = Color.Black, thickness = 2.dp,
            modifier = Modifier.padding(top = 16.dp).fillMaxWidth())
        Text (
            text = "Titulo",
            style = smallLettersStyle
        )
        Text (
            text = "Title",
            style = smallLettersStyle
        )
        Text (
            text = "__ Desenhar\n   Portugal",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h3.copy(fontWeight = FontWeight.Light),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun BottomHalf(

) {
    val smallLettersStyle = MaterialTheme.typography.overline
    Row (
        modifier = Modifier.fillMaxWidth()
    ) {

        //first element
        Column (
            modifier = Modifier.weight(1f).padding(end = 16.dp)
        ) {
            Divider (color = Color.Black, thickness = 2.dp)
            Text(
                text = "Data",
                style = smallLettersStyle
            )
            Text (
                text = "Date",
                style = smallLettersStyle
            )
            Text (
                text = "22.11.2019",
                modifier = Modifier
                    .padding(top = 4.dp)

            )
            Text (
                text = "23.02.2020",
                modifier = Modifier
                    .padding(top = 4.dp)

            )
        }

        //second element
        Column (
            modifier = Modifier.weight(1f).padding(end = 16.dp)
        ) {
            Divider (color = Color.Black, thickness = 2.dp)
            Text(
                text = "Data",
                style = smallLettersStyle
            )
            Text (
                text = "Date",
                style = smallLettersStyle
            )
            Text (
                text = "Galeria Municipal de Matosinhos",
                modifier = Modifier
                    .padding(top = 4.dp)

            )
        }

        //third element
        Column (
            modifier = Modifier.weight(1f).padding(end = 16.dp)
        ) {
            Divider (color = Color.Black, thickness = 2.dp)
            Text(
                text = "Promovido por",
                style = smallLettersStyle
            )
            Text (
                text = "Promoted by",
                style = smallLettersStyle
            )
            Text (
                text = "Porto.",
                modifier = Modifier
                    .padding(top = 4.dp)
                    .border(width = 2.dp, color = Color.Black)
                    .padding(8.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewApp() {
    AppUI {
        UpperHalf()
    }
}

