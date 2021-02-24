var Rectangle= 
{
    "Width":40,
    "height":30
}
Rectangle.Width;

Rectangle.getArea=function(){return this.width*this.height}
// Rectangle.prototype.getArea()={ return  (Width*height)}


function object(FName,LName)
{
    this.FName=FName;
    this.LName=LName;
}
var obj1=new object("venkat","Sai");