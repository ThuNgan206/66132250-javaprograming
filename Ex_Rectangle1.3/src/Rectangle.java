public class Rectangle {
   private float length = 1.0f;
   private float width = 1.0f;
   //constructor mặc định
   public Rectangle() {
   }
   //constructor có tham số 
   public Rectangle(float length, float width) {
	   this.length = length;
	   this.width = width;
   }
   //getter
   public float getLength() {
	   return length;
   }
   public float getWidth() {
	   return width;
   }
   //setter
   public void setLength(float length) {
	   this.length = length;
   }
   public void setWidth(float width) {
	   this.width = width;
   }
   //tính diện tích
   public double getArea() {
	   return length * width;
   }
   //tính chu vi
   public double getCircumference() {
	   return 2 * (length + width);
   }
   //toString
   public String toString() {
	   return "Rectangle[length = " + length + ", width = " + width + "]";
   }
}
