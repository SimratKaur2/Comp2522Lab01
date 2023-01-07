package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

//constants should be the first thing in your class.
//constants should be static and final, are often public
// and should be followed by instance variables.
/**
 * Creates a Christmas tree using different 2D
 * primitive shapes.
 *
 * @author Simrat Kaur
 * @version 1.0
 */
public class Window extends PApplet { public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }

  /**
   * Sets up the window size.
   */
  public final void settings() {
    size(500, 500);
  }

  /**
   * Draws a Christmas tree using the 2D primitives.
   */
  public final void draw() {

    //setting the background color to skyblue.
    background(135, 206, 235);

    // drawing the tree.
    fill(0, 152, 86);
    triangle(120, 350, 232, 140, 344, 350);
    triangle(120, 300, 232, 80, 344, 300);
    fill(5, 93, 21);

    // drawing a rectangle that represents the grass.
    rect(0, 430, 500, 70);
    fill(165, 183, 189);

    //the trunk of the tree.
    fill(127, 60, 22);
    rect(215, 350, 40, 90);

    //decorations on the tree
    fill(255, 0, 0);
    circle(340, 350, 10);
    circle(150,350,10);
    circle(250,350,10);

    // drawing a cloud
    fill(211, 211, 211);
    ellipse(420, 80, 50, 50);
    ellipse(470, 75, 70, 50);
    ellipse(450, 100, 150, 55);
  }
}