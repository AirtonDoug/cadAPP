package com.example.cadapp



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cadapp.ui.theme.CadAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CadAppTheme {
                    CadApp()
                }
            }
        }
    }
@Composable
fun CadApp(){
    var name by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var birthDate by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var cellPhone by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var number by remember { mutableStateOf("") }
    var neighbor by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var state by remember { mutableStateOf("") }
    var zipcode by remember { mutableStateOf("") }
    var nation by remember { mutableStateOf("") }
    var job by remember { mutableStateOf("") }

    LazyColumn  (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        item{
            Spacer(modifier = Modifier.height(20.dp))
            TextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Nome:") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = lastName,
                onValueChange = { lastName = it },
                label = { Text("Sobrenome:") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = birthDate,
                onValueChange = { birthDate = it },
                label = { Text("Data de nascimento:") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = gender,
                onValueChange = { zipcode = it },
                label = { Text("Gẽnero:") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = phone,
                onValueChange = { phone = it },
                label = { Text("Telefone:") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = cellPhone,
                onValueChange = { cellPhone = it },
                label = { Text("Celular:") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email:") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = address,
                onValueChange = { address = it },
                label = { Text("Endereço:") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = number,
                onValueChange = { number = it },
                label = { Text("Numero:") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = neighbor,
                onValueChange = { neighbor = it },
                label = { Text("Bairro:") },
                modifier = Modifier.fillMaxWidth()

            )

            TextField(
                value = city,
                onValueChange = { city = it },
                label = { Text("Cidade:") },
                modifier = Modifier.fillMaxWidth()

            )

            TextField(
                value = state,
                onValueChange = { state = it },
                label = { Text("Estado:") },
                modifier = Modifier.fillMaxWidth()

            )

            TextField(
                value = zipcode,
                onValueChange = { zipcode = it },
                label = { Text("Música favorita:") },
                modifier = Modifier.fillMaxWidth()

            )

            TextField(
                value = nation,
                onValueChange = { nation = it },
                label = { Text("Nacionalidade") },
                modifier = Modifier.fillMaxWidth()

            )

            TextField(
                value = job,
                onValueChange = { job = it },
                label = { Text("Profissão") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row (
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = {
                    },
                    modifier = Modifier.weight(1f).padding(16.dp)
                ) {
                    Text(text = "Enviar")
                }

                Button(
                    onClick = {
                        name = ""
                        lastName = ""
                        birthDate = ""
                        zipcode = ""
                        nation = ""
                        state = ""
                        gender = ""
                        neighbor = ""
                        email = ""
                        city = ""
                        phone = ""
                        cellPhone = ""
                        job = ""
                        address = ""
                        number = ""
                    },
                    modifier = Modifier.weight(1f).padding(16.dp)
                ) {
                    Text(text = "Limpar")
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CadAppTheme {
        CadApp()
    }
}



