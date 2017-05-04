// Aftellen van beweegtijd:
if (moveTimeCurrent > 0)
{ moveTimeCurrent--; }
else
{
    // Zodra de tijd om is, bepaal de nieuwe richting.
    // Zet de tijd weer op zijn oorspronkelijke waarde.
    moveDirection = floor(random(4));
    moveTimeCurrent = moveTime;
}

// Voer de beweging in de huidige richting uit:
if      (moveDirection == 0) // Links
{ x -= moveSpeed; }
else if (moveDirection == 1) // Rechts
{ x += moveSpeed; }
else if (moveDirection == 2) // Omhoog
{ y -= moveSpeed; }
else if (moveDirection == 3) // Omlaag
{ y += moveSpeed; }

