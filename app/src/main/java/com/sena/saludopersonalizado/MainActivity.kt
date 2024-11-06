package com.sena.saludopersonalizado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sena.saludopersonalizado.ui.theme.SaludoPersonalizadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SaludoPersonalizadoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SaludoPersonalizadoScreen()
                }
            }
        }
    }
}

@Composable
fun SaludoPersonalizadoScreen() {
    var name by remember { mutableStateOf("") }
    var greeting by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Ingresa tu nombre") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { greeting = "Hola, $name!" }) {
            Text("Mostrar Saludo")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = greeting,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SaludoPersonalizadoPreview() {
    SaludoPersonalizadoTheme {
        SaludoPersonalizadoScreen()
    }
}
