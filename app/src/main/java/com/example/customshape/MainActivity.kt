package com.example.customshape

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.customshape.ui.theme.CustomShapeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomShape()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomShape() {
    CustomShapeTheme {
        Box(
            modifier = Modifier
                .size(200.dp)
                .drawBehind {
                    val path = Path().apply {
                        moveTo(100f, 100f)
                        lineTo(500f, 500f)
                        lineTo(100f, 500f)
                        close()
                    }
                    drawPath(
                        path = path,
                        color = Color.LightGray
                    )
                }) {
        }
    }
}

