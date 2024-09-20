package com.incirkus.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.incirkus.myapplication.Composables.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val imageList2: List<Int> = listOf(
            R.drawable.pexels2_bt3gl_3894157,
            R.drawable.pexels2_alancabello_1382070,
            R.drawable.pexels2_alexfu_1302436,
            R.drawable.pexels2_cottonbro_6543897,
            R.drawable.pexels2_eberhardgross_1366919,
            R.drawable.pexels2_eberhardgross_1624496,
            R.drawable.pexels2_eberhardgross_2088210,
            R.drawable.pexels2_egos68_1906658,
            R.drawable.pexels2_francesco_ungaro_1526713,
            R.drawable.pexels2_g0gor_1301981,
            R.drawable.pexels2_ifreestock_616838,
            R.drawable.pexels2_iriser_1381679,
            R.drawable.pexels2_jeremy_bishop_1260133_2397652,
            R.drawable.pexels2_jonasvonwerne_1969979,
            R.drawable.pexels2_kovyrina_937980,
            R.drawable.pexels2_lizromo24_1999579,
            R.drawable.pexels2_lilartsy_1425353,
            R.drawable.pexels2_martin_mariani_2162253_3801458,
            R.drawable.pexels2_philippedonn_1257860,
            R.drawable.pexels2_philippedonn_1105189,
            R.drawable.pexels2_pixabay_36445,
            R.drawable.pexels2_pixabay_270873,
            R.drawable.pexels2_rbrigant44_2526097,
            R.drawable.pexels2_ryutaro_5472598,
            R.drawable.pexels2_scottwebb_1029596,
            R.drawable.pexels2_semws_2670898,
            R.drawable.pexels2_tomtookit_1914663_3538659,
            R.drawable.pexels2_zachtheshoota_2640024,
            R.drawable.pexels2_zetong_li_880728_1784578,
        )
        enableEdgeToEdge()
        setContent {
            HomeScreen(imageList2)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val imageList: List<Int> = listOf(
        R.drawable.pexels2_bt3gl_3894157,
        R.drawable.pexels2_alancabello_1382070,
        R.drawable.pexels2_alexfu_1302436,
        R.drawable.pexels2_cottonbro_6543897,
        R.drawable.pexels2_eberhardgross_1366919,
        R.drawable.pexels2_eberhardgross_1624496,
        R.drawable.pexels2_eberhardgross_2088210,
        R.drawable.pexels2_egos68_1906658,
        R.drawable.pexels2_francesco_ungaro_1526713,
        R.drawable.pexels2_g0gor_1301981,
        R.drawable.pexels2_ifreestock_616838,
        R.drawable.pexels2_iriser_1381679,
        R.drawable.pexels2_jeremy_bishop_1260133_2397652,
        R.drawable.pexels2_jonasvonwerne_1969979,
        R.drawable.pexels2_kovyrina_937980,
        R.drawable.pexels2_lizromo24_1999579,
        R.drawable.pexels2_lilartsy_1425353,
        R.drawable.pexels2_martin_mariani_2162253_3801458,
        R.drawable.pexels2_philippedonn_1257860,
        R.drawable.pexels2_philippedonn_1105189,
        R.drawable.pexels2_pixabay_36445,
        R.drawable.pexels2_pixabay_270873,
        R.drawable.pexels2_rbrigant44_2526097,
        R.drawable.pexels2_ryutaro_5472598,
        R.drawable.pexels2_scottwebb_1029596,
        R.drawable.pexels2_semws_2670898,
        R.drawable.pexels2_tomtookit_1914663_3538659,
        R.drawable.pexels2_zachtheshoota_2640024,
        R.drawable.pexels2_zetong_li_880728_1784578,
    )
    HomeScreen(imageList)
}