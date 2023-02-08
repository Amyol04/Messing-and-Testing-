1: import java.awt.*
2: import java.awt. geom.*
3: import javax.swing."
5: public class Map extends JFrame {
public Map0 {
super(Map");
setSize(350, 350);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
MapPane map = new MapPane0;
add (map);
setVisible(true);
public static void main(String arguments) (
Map frame = new Map0:
19:}
20:
21: class MapPane extends JPanel {
22:
23:
public void paintComponent(Graphics comp) {
24:
Graphics2D comp2D = (Graphics2D)comp;
comp2D.setColor(Color.blue);
25:
comp2D. setRenderingHint(RenderingHints.KEY_ANTIALIASING,
26:
RenderingHints.VALUE_ANTIALIAS_ON);
27:
28:
Rectangle2D.Float background = new Rectangle2D. Float
OF, OF, (float)getSize width, (float)getSize0.height); comp2D.fill(background);
/I Draw waves
31:
comp2D.setColor(Color white);
33:
BasicStroke pen = new BasicStroke(2F
BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
34:
comp2D.setStroke(pen);
35:
for (int ax = 0; ax < 340; ax += 10)
36:
for (int ay = 0; ay < 340 ; ay += 10) (
Arc2D.Float wave = new Arc2D.Float(ax, ay,
38;
10, 10, 0, -180, Arc2D.OPEN);
39:
comp2D.draw(wave);
40:
41R
// Draw Florida
GradientPaint gp = new GradientPaint(OF, OF, Color.green,
350F,350F, Color.orange, true); comp2D.setPaint(gp);
GeneralPath f1 = new GeneralPath0:
fl.move To(10F, 12F);
fillineTo(234F, 15F);
f.line To (253F, 25F); f.lineTo (261F, 71F); f.line To(344F, 209F); f.line To (336F, 278F);
f. line To(295F, 310F); f.lineTo(259F, 274F):
flineTo(205F, 188F)
f.line To(211F, 171F); fl.lineTo(195F, 174F);
Al lineTo(191F, 118F);
Ліпото(3аг: 86).
fi.closePath0; comp2D. fill (h);
// Draw ovals
comp2D.setColor(Color.black);
BasicStroke pen2 = new BasicStroke;
comp2D.setStroke (pen2);
Ellipse2D.Float e1 = new Ellipse2D. Float(235, 140, 15, 15);
Ellipse2D.Float e2 = new Ellipse2D. Float(225, 130, 15, 15);
Ellipse2D.Float e3 = new Ellipse2D.Float(245, 130, 15, 15);
comp2D.fill(el); comp2D.fill(e2); comp2D.fill(e3);