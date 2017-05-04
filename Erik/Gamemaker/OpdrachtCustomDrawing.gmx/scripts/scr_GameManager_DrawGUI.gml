// OPDRACHT A:

// Teken hier de score en levens van de speler op het scherm door middel van
// het tekenen van tekst en sprites.



draw_set_colour(c_purple);
draw_set_font(font_Centaur);
draw_text(600, 32, player.currentPoints);

var i;
for (i= 0; i < player.currentLives; i++)
{
draw_sprite(spr_Lives, image_index, 32+i*32, 32);
}


