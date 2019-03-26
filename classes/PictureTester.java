/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester{



  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
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


  public static void testNegate(){
    Picture canvas = new Picture("beach.jpg");
    canvas.negate();
    canvas.explore();
  }

  public static void testKeepOnlyBlue(){
    Picture swan = new Picture("swan.jpg");
    swan.KeepOnlyBlue();
    swan.explore();
  }

  public static void testGrayscale(){
    Picture swan = new Picture("gorge.jpg");
    swan.grayscale();
    swan.explore();
  }

  public static void testMirrorVerticalRightToLeft(){
    Picture barbaraS = new Picture("barbaraS.jpg");
    barbaraS.mirrorVerticalRightToLeft();
    barbaraS.explore();
  }
  public static void testmirrorHorizontalBotToTop(){
    Picture swan = new Picture("gorge.jpg");
    swan.mirrorHorizontalBotToTop();
    swan.explore();
  }
  public static  void testmirrorHorizontal(){
    Picture swan = new Picture( "gorge.jpg");
    swan.mirrorHorizontal();
    swan.explore();
  }
  public static  void testMirrorArms(){
    Picture swan = new Picture( "snowman.jpg");
    swan.mirrorArms();
    swan.explore();
  }

  public static void testCopy(){
    Picture p = new Picture("beach.jpg");
    p.explore();
    Picture swan = new Picture("swan.jpg");
    swan.copy(p,200,200,160,300,240,400);
    swan.explore();
  }
  public static void testmyCollage(){
    Picture p = new Picture("temple.jpg");
    p.myCollage();
    p.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testmirrorHorizontal();
    //testmirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testmyCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testMirrorVerticalRightToLeft();
    //


  }
}