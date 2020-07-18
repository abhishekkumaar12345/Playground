#include<stdio.h>
int main()
{
int a,b,c,d,e;
scanf("%d",&a);
b=a/365;
d=a%365;
c=d/7;
e=d%7;
printf("%d\n",b);
printf("%d\n",c);
printf("%d",e);
    return 0;
    
}