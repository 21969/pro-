// OPDRACHT A, B & C:

ini_open("savegame.ini");

var xpos = ini_read_string("player", "xPos", base64_encode(string(0)));
var ypos = ini_read_string("player", "yPos", base64_encode(string(0)));

ini_close();

obj_Player.x = real(base64_decode(xpos));
obj_Player.y = real(base64_decode(ypos));
