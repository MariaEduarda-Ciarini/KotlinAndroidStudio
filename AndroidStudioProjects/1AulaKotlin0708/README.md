# Aprendendo a Usar Android Studio com Kotlin

Este repositório contém exemplos e anotações sobre o uso da IDE Android Studio para o desenvolvimento de aplicativos Android utilizando a linguagem Kotlin. O foco é em aprender os conceitos básicos da IDE, criar e visualizar uma tela simples usando Jetpack Compose.

## Índice

1. [Introdução ao Android Studio](#introdução-ao-android-studio)
2. [Configurando o Ambiente](#configurando-o-ambiente)
3. [Criando um Novo Projeto](#criando-um-novo-projeto)
4. [Estrutura do Projeto](#estrutura-do-projeto)
5. [Desenvolvendo e Visualizando uma Tela Simples](#desenvolvendo-e-visualizando-uma-tela-simples)
6. [Navegação Básica na IDE](#navegação-básica-na-ide)
7. [Considerações Finais](#considerações-finais)

## Introdução ao Android Studio

Android Studio é a IDE oficial para o desenvolvimento de aplicativos Android. Com ela, você pode criar, testar e depurar aplicativos usando Kotlin, a linguagem recomendada pela Google para desenvolvimento Android.

## Configurando o Ambiente

1. **Download e Instalação:**
   - Baixe o Android Studio no [site oficial](https://developer.android.com/studio) e siga as instruções de instalação para seu sistema operacional.

2. **Configuração Inicial:**
   - Após a instalação, abra o Android Studio e configure o SDK do Android. Certifique-se de que a opção para baixar o SDK mais recente está selecionada.

## Criando um Novo Projeto

1. **Passo a Passo:**
   - No Android Studio, selecione "Start a new Android Studio project".
   - Escolha "Empty Activity" para iniciar com um projeto básico.
   - Configure o nome do aplicativo, domínio da empresa (opcional), e escolha Kotlin como a linguagem de programação.

## Estrutura do Projeto

Ao criar um projeto no Android Studio, você verá uma estrutura de diretórios que inclui:

- **`app/src/main/java`**: Contém o código fonte Kotlin do aplicativo.
- **`app/src/main/res`**: Contém os recursos do aplicativo, como layouts, imagens e strings.
- **`AndroidManifest.xml`**: Arquivo de configuração do aplicativo, onde você define a estrutura básica e permissões.

## Desenvolvendo e Visualizando uma Tela Simples

### Exemplo de Código

```kotlin
package br.com.fiap.aula1Kotlin07_08

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.fiap.aula1Kotlin07_08.ui.theme._1AulaKotlin0708Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _1AulaKotlin0708Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Aqui o $name!",
            modifier = modifier,
            fontSize = 32.sp,
            color = Color.Cyan
        )
        Text(text = "Estudando Android")
        Button(onClick = {  }) {
            Column {
                Text(text = "Click over here")
                Text(text = "Click over here")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    _1AulaKotlin0708Theme {
        Column {
            Greeting("PC VAI EXPLODIR")
            Greeting("PC VAI EXPLODIR")
        }
    }
}

Explicação do Código
Criação da Atividade Principal:

A classe MainActivity estende ComponentActivity e configura a interface usando Jetpack Compose dentro do método onCreate.

Definição do Layout com Jetpack Compose:

A função Greeting cria uma coluna (Column) que contém textos e um botão. O primeiro Text exibe uma mensagem personalizada usando o parâmetro name. O botão, ao ser clicado, pode executar uma ação (a ser definida).
Visualização da Tela:

A função GreetingPreview usa o @Preview para permitir a visualização da tela diretamente na IDE, mostrando como ela aparecerá no dispositivo.

Navegação Básica na IDE
Barra de Ferramentas: Contém atalhos para compilar, rodar e depurar seu projeto.
Project Explorer: Navegue pelos arquivos do projeto.
Logcat: Exibe logs do sistema e mensagens de depuração.

Considerações Finais
Este repositório serve como uma introdução básica ao Android Studio e ao desenvolvimento de aplicativos Android usando Kotlin e Jetpack Compose. O exemplo de código aqui fornecido cria e visualiza uma tela simples, permitindo que você entenda a estrutura básica de um aplicativo Android moderno. À medida que você se sentir mais confortável, explore recursos mais avançados para criar interfaces de usuário mais complexas e interativas.