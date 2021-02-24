function max(a,b,c)
{
    if(a>b&&a>c)
        return a;
    else if(b>a&&b>c)
    return b;
    else{
        return c;
    }
}
console.log(max(1,3,4));
console.log(max(1, 3, 2)); 
console.log(max(3, 2, 1));