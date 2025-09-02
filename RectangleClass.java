class RectangleClass{
  public static void main(String[] args){
    Rectangle r = new Rectangle();
    r.setWidth(12);
    r.setLength(15);
    System.out.println("Aread of Rectangle with a length of "+r.getLength()+" and width of "+r.getWidth()+" is "+r.area());
  }
}
class  Rectangle{
  private int length, width;

  public void setLength(int length){
    if(length>0){
      this.length = length;
    }
  }
  public void setWidth(int width){
    if(width>0){
      this.width = width;
    }
  }
  public int getLength(){
    return length;
  }
  public int getWidth(){
    return width;
  }
  public int area(){
    return length * width;
  }

}
