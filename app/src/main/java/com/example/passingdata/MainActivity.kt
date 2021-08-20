package com.example.passingdata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.passingdata.ui.theme.PassingDataTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PassingDataTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    PassData()
                }
            }
        }
    }
}

@Composable
fun PassData(){
    Column(modifier = Modifier.padding(16.dp),
        ) {
        var name by remember { mutableStateOf("") }

        Text(
            text = "Hello $name",
            modifier =Modifier.padding(bottom = 8.dp),
        )

        OutlinedTextField(
            value = name ,
            onValueChange = {name = it},
            label = { Text ("Name")}
        )

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PassingDataTheme {
        PassData()

    }
}