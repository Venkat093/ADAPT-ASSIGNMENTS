var Rectangle= 
{
    "Width":40,
    "height":30
}
Rectangle.Width;

Rectangle.getArea=function(){return this.width*this.height}
// Rectangle.prototype.getArea()={ return  (Width*height)}
//Q2
function rectangle(width,height)
{
    this.width=width;
    this.height=height;
    this.getArea=this.width*this.height;
}
const x=new rectangle(4,5);
console.log(x);
x.height=20;
x.getArea();



//Q4
function object(FName,LName)
{
    this.FName=FName;
    this.LName=LName;
}
var obj1=new object("venkat","Sai");

//Q5
function object(FName,LName)
{
    this.FName=FName;
    this.LName=LName;
}
var obj1=new object("venkat","Sai");
obj1.mName;
//gives undefined as it doesnet have mName 
//property in it

//Q6
var firstname="s";
var Lastyname="ai";
var fulname=`${firstname} ${Lastyname}`;

//Q7
var firstname="s";
var Lastyname="ai";
var fulname=`${firstname} ${Lastyname}`;
parseJSON(fulname);

//Q7.1
var person={
    "fname":"venkat",
    "lname":"sai",
    "age":20,
    "skills":["java","python"],
    "address":{
        "city":"ongole",
        "pincode":523001
    }
    "DOB":27,
   " married":false,
   "profession":"Analyst"
}


function person(fname,lname,age,skills,dateofbirth,address,married,profession)
 {
 this.fname=fname;
 this.lname=lname;
 this.age=age;
 this.skills=skills;
 this.dateofbirth=dateofbirth;
 this.address=address;
 this.married=married;
 this.profession=profession;
 }
 person1=new person("nikhil","goud",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst")
person2=new person("harish","chinna",21,"HTML","08/06/1997",{city:"Ameerpet",pincode:"500038"},"false","jranalyst");

print=function()
{
 console.log(person1);
 console.log(person2);
}();


//Q7.2
function person(fname,lname,age,skills,dateofbirth,address,married,profession)
 {
 this.fname=fname;
 this.lname=lname;
 this.age=age;
 this.skills=skills;
 this.dateofbirth=dateofbirth;
 this.address=address;
 this.married=married;
 this.profession=profession;
 }
 amithab=new person("amithab","bachan",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sranalyst")
abhisheik=new person("abhisheik",21,"HTML","08/06/1997","false","jr analyst")
var abhisheik=Object.create(amithab);
print=function()
{
 console.log(amithab);
 console.log(abhisheik.lname);
 console.log(abhisheik.address);
}();

//Q7.3
aradya=new person("aradya","gour",23,["A"],"23/12/1995",{city:"hyderabad",pincode:"521185"},"false","sranalyst")

//Q7.4

function BankAccount(accountnumber,accountHoldername,accountBalance,isSalary=false,odLimit=NaN)
{
    this.accountnumber=accountnumber;
    this.accountHoldername=accountHoldername;
    this.accountBalance=accountBalance;
    this.isSalary=isSalary;
    this.odLimit=odLimit;
}

BankAccount.WithDraw()=function(drawAmount)
{
    if(this.isSalary)
    {
       
    if(this.accountBalance>drawAmount)
    {
        this.accountBalance -=drawAmount;
        console.log("withdrawn succ");
    }
    console.log("insufficient");
}
    else
    {
        if(drawAmount<accountBalance+odLimit)
        {
            this.accountBalance-=drawAmount;
            console.log("withdrawn succ");
        }
        console.log("insufficient");
    }
}
var account1=new BankAccount(1,"venkat",2000,true,10000);
var account1=new BankAccount(1,"sai",500,false);
account1.WithDraw(1000);