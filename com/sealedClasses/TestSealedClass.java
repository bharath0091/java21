package com.sealedClasses;

public class TestSealedClass {

    public sealed class Shape permits Circle, Square, Rectangle {
    }


    public final class Circle extends Shape {
        public float radius;
    }

    public non-sealed class Square extends Shape {
        public double side;
    }

    public sealed class Rectangle extends Shape permits FilledRectangle {

    }

    public final class FilledRectangle extends Rectangle {
        public int red, green, blue;
    }

    public class SquareExtension extends Square {

    }

}
