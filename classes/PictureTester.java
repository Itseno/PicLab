/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture koala = new Picture("koala.jpg");
    koala.explore();
    koala.zeroBlue();
    koala.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture koala = new Picture("koala.jpg");
    koala.mirrorVerticalRightToLeft();
    koala.explore();
  }
  
  public static void testMirrorHorizontal(){
    Picture moon = new Picture("moon-surface.jpg");
    moon.mirrorHorizontal();
    moon.explore();
  }
  
  public static void testMirrorHorizontalBotToTop(){
    Picture moon = new Picture("moon-surface.jpg");
    moon.mirrorHorizontalBotToTop();
    moon.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture wall = new Picture("wall.jpg");
    wall.mirrorDiagonal();
    wall.explore();
  }
  
  public static void testMirrorArms(){
    Picture snowman = new Picture("snowman.jpg");
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull(){
    Picture seagull = new Picture("seagull.jpg");
    seagull.mirrorGull();
    seagull.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetectionTWO()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetectionTWO(100);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue(){
    Picture koala = new Picture( "koala.jpg" );
    koala.keepOnlyBlue();
    koala.explore();
  }
  
  public static void testNegate(){
    Picture koala = new Picture( "koala.jpg" );
    koala.negate();
    koala.explore();
  }
  
  public static void testCopy() {
        Picture flower = new Picture("flower1.jpg");
        flower.explore();
        flower.copy(flower, 0, 50);
        flower.explore();
    }
  
  public static void testCopyTWO(){
    Picture kitten = new Picture("kitten2.jpg");
    kitten.explore();
    kitten.copyTWO(kitten,9,30,58,14);
    kitten.explore();
  }
  
  public static void testGrayscale(){
        Picture koala = new Picture( "koala.jpg" );
        koala.grayscale();
        koala.explore();
    }
  
  public static void testFixUnderwater(){
        Picture water = new Picture( "water.jpg" );
        water.explore();
        water.fixUnderwater();
        water.explore();
    }
  
  public static void testMyCollage() {
        Picture canvas = new Picture(225 * 4, 224 * 4);
        canvas.myCollage();
        canvas.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorTemple();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    testMirrorDiagonal();
    testMirrorArms();
    testMirrorGull();
    testCollage();
    testMyCollage();
    testCopy();
    testCopyTWO();
    testEdgeDetection();
    testEdgeDetectionTWO();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}