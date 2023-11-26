package edu.utvt.propina_base.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

private val IconButtonSizeModifier = Modifier.size(40.dp)

@Composable
fun RoundIconButton(
    imageVector: ImageVector = Icons.Default.Done,
    modifier:Modifier = Modifier,
    colors: CardColors = CardDefaults.cardColors(containerColor = Color.White, contentColor = Color.Black),
    elevation: CardElevation = CardDefaults.cardElevation(4.dp),
    onClick:()->Unit = {}
){
    Card(
        modifier = modifier.padding(4.dp).clickable(onClick = onClick).then(IconButtonSizeModifier),
        shape = CircleShape,
        elevation = elevation,
        colors = colors
    ){
        Icon(
            imageVector = imageVector,
            null,
            modifier = Modifier.padding(top = 9.dp).align(alignment = Alignment.CenterHorizontally)
        )
    }
}

