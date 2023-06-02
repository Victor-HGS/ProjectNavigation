package com.example.jetpackcompose
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Screen2(controleNaveg:NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar { Text(text = "Feito por João e Victor") }
        }

    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {


            Text(text = "João Felix e Victor Hugo")
            Button(onClick = {controleNaveg.popBackStack()}) {
                Text(text = "Voltar")
            }
            //Button(onClick = {navController.navigateUp()}) {
            //    Text(text = "Back")
           // }
        }
    }
}