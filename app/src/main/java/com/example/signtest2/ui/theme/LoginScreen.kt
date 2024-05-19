package com.example.signtest2.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.signtest2.R
import `fun`.EmailName
import `fun`.Password

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun LoginScreen (
    navController: NavController
){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar (
                actions = {
                    IconButton(onClick = {}){
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "ArrowBack Icon")
                    }
                },
                title = {
                    Text(
                        text = "Jekdo",
                        fontFamily = FontFamily(
                            Font(R.font.outfit_bold)
                        ),
                        fontSize = 40.sp,
                        modifier = Modifier.offset(x = -130.dp)
                    ) },

                )
        },
        content = {paddingValue ->
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(paddingValue),
                contentAlignment = Alignment.Center)
            {
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start)
                    {
                        Spacer(modifier = Modifier.size(60.dp))

                        Text(text = "Login",
                            fontSize = 26.sp,
                            fontFamily = FontFamily(
                                Font(R.font.outfit_bold)
                            ),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                        )
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(text = "Selamat datang di Jekdo",
                            fontSize = 20.sp,
                            fontFamily = FontFamily(
                                Font(R.font.outfit_regular)
                            ),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .alpha(0.5f),
                        )
                        Spacer(modifier = Modifier
                            .size(45.dp)
                        )
                        Text(text = "Email",
                            fontSize = 20.sp,
                            fontFamily = FontFamily(
                                Font(R.font.outfit_bold)
                            ),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                        )
                        Spacer(modifier = Modifier.size(4.dp))
                        EmailName()

                        Spacer(modifier = Modifier.size(20.dp))

                        Box(modifier = Modifier.fillMaxWidth()){
                            Row (
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start)
                            {
                                Text(text = "Password",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily(
                                        Font(R.font.outfit_bold)
                                    ),
                                    modifier = Modifier
                                        .padding(horizontal = 20.dp)
                                )
                            }
                            Row (
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End)
                            {
                                Text(text = "Lupa Password?",
                                    fontSize = 14.sp,
                                    fontFamily = FontFamily(
                                        Font(R.font.outfit_bold)
                                    ),
                                    color = Color(0xFF0288D1),
                                    modifier = Modifier
                                        .padding(horizontal = 20.dp)
                                        .offset(y = 4.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.size(4.dp))
                        Password()

                        Spacer(modifier = Modifier.size(20.dp))

                        Button(
                            onClick = {},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = (Color(0xFF0288D1))),
                            elevation = ButtonDefaults.buttonElevation(
                                defaultElevation = 6.dp,
                                pressedElevation = 6.dp
                            )
                        )
                        {
                            Text(text = "Login",
                                fontFamily = FontFamily(
                                    Font (R.font.outfit_regular)
                                ),
                                fontSize = 20.sp
                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))

                        Row (
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ){
                            Text(text = "Atau Login menggunakan Google",
                                fontFamily = FontFamily(Font (R.font.outfit_regular))
                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))

                        Button(
                            onClick = {},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = (Color.Gray)),
                            elevation = ButtonDefaults.buttonElevation(
                                defaultElevation = 6.dp,
                                pressedElevation = 6.dp
                            )
                        )
                        {
                            Text(text = "Login pake gugel",
                                fontFamily = FontFamily(
                                    Font (R.font.outfit_regular)
                                ),
                                fontSize = 20.sp
                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))

                        Row (
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ){
                            Text(text = "Buat akun",
                                fontSize = 14.sp,
                                fontFamily = FontFamily(
                                    Font(R.font.outfit_bold)
                                ),
                                modifier = Modifier
                                    .padding(horizontal = 20.dp)
                                    .clickable {
                                        navController.navigate(route = Screen.SignIn.route)
                                    },
                                color = Color (0xFF0288D1)
                            )
                        }

                    }

                }





        }
    )
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview (){
    LoginScreen(
        navController = rememberNavController()
    )
}

