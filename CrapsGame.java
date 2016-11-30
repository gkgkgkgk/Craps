// Implements the game of Craps logic

public class CrapsGame {
 private int point = 0;
 boolean first = true;
 /**
  *  Calculates the result of the next dice roll in the Craps game.
  *  The parameter total is the sum of dots on two dice.
  *  point is set to the saved total, if the game continues,
  *  or 0, if the game has ended.
  *  Returns 1 if player won, -1 if player lost,
  *  0 if player continues rolling.
  */
 public int processRoll(int total) {

  int result = 0;
  if (point == total) {
   result = 1;
   first = true;
   point = 0;
  } else {

   switch (total) {
    case 7:
     if (point == 0) {
      result = 1;
      first = true;
     } else {
      result = -1;
      point = 0;
      first = true;
     }
     break;
    default:
     if (first) {
      point = total;
      first = false;
     }


     break;

   }
  }
  return result;
 }

 /**
  *  Returns the saved point
  */
 public int getPoint() {
  return point;
 }
}