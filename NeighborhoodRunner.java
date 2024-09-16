import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

// creates a mural painter object
MuralPainter backgroundPainter = new MuralPainter();
    
// paints the background
  backgroundPainter.paintBackground("White", 32);

    // creates a toad painter object
ToadPainter painter = new ToadPainter();

    // paints toad
    painter.paintToad();

int currentX = painter.getX();
int currentY = painter.getY();
System.out.println(currentX + ", " + currentY);

    
  }
}