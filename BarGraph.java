import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;
 

/*Code is from stack overflow then modified to fit needs*/
public class BarGraph extends JPanel {
  /**
	 * 
	 */
private static final long serialVersionUID = -4389067912602888412L;

private double[] values;
  private String[] names;
  private String title;
 /**
  * Construct a bar graph 
  * @param v information as a double[] each element is a bar
  * @param n each string corresponds to a title of a bar
  * @param t title of the graph
  */
  public BarGraph(double[] v, String[] n, String t) {
    names = n;
    values = v;
    title = t;
  }
  
  /**
   * 
   * @return int[] with width modifier at [0] and height modifier at [1]
   */
  public int[] getSizeOfWindow()
  {
	  double max = 0;
	  for (int i = 0; i < values.length; i++)
	  {
		  if (max < values[i])
		  {
			  max = values[i];
		  }
	  }
	  int[] lengths = {values.length, (int) max};
	  return lengths;
  }
  /**
   * Paints the graph
   */
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (values == null || values.length == 0)
      return;
    double minValue = 0;
    double maxValue = 0;
    for (int i = 0; i < values.length; i++) {
      if (minValue > values[i])
        minValue = values[i];
      if (maxValue < values[i])
        maxValue = values[i];
    }
 
    Dimension d = getSize();
    int clientWidth = d.width;
    int clientHeight = d.height;
    int barWidth = clientWidth / values.length;
 
    Font titleFont = new Font("SansSerif", Font.BOLD, 20);
    FontMetrics titleFontMetrics = g.getFontMetrics(titleFont);
    Font labelFont = new Font("SansSerif", Font.PLAIN, 15);
    FontMetrics labelFontMetrics = g.getFontMetrics(labelFont);
 
    int titleWidth = titleFontMetrics.stringWidth(title);
    int y = titleFontMetrics.getAscent();
    int x = (clientWidth - titleWidth) / 2;
    g.setFont(titleFont);
    g.drawString(title, x, y);
 
    int top = titleFontMetrics.getHeight();
    int bottom = labelFontMetrics.getHeight();
    if (maxValue == minValue)
      return;
    double scale = (clientHeight - top - bottom) / (maxValue - minValue);
    y = clientHeight - labelFontMetrics.getDescent();
    g.setFont(labelFont);
 
    for (int i = 0; i < values.length; i++) {
      int valueX = i * barWidth + 1;
      int valueY = top;
      int height = (int) (values[i] * scale);
      if (values[i] >= 0)
        valueY += (int) ((maxValue - values[i]) * scale);
      else {
        valueY += (int) (maxValue * scale);
        height = -height;
      }
 
      g.setColor(Color.red);
      g.fillRect(valueX, valueY, barWidth - 80, height);
      g.setColor(Color.black);
      g.drawRect(valueX, valueY, barWidth - 80, height);
      int labelWidth = labelFontMetrics.stringWidth(names[i]);
      x = i * barWidth + (barWidth - labelWidth) / 2;
      g.drawString(names[i] + ", Value: " + values[i], x -60, y);
      
      
    
    }
    
	
  }
  
}