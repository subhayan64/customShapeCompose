package com.example.customshape

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
                .clip(ChatBubble())
                .background(Color.Red)
                .padding(start = 32.dp, top = 16.dp, end = 16.dp, bottom = 32.dp)
                ) {
            Text(text = "hello world!", )
        }
    }
}

