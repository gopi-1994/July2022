#include<stdio.h>
#include<conio.h>
int main(){
    int year;
printf("Enter a year... ");
scanf("%d",&year);
int i,j;
for(i=1;i<10;i++){
    for(j=0;j<=i;j++){
        printf("*\t");
    }
    printf("\n");
}


if(((year%400 == 0)&&!(year%100 == 0))||(year%4 == 0 )){
    printf("It is a leap Year");

}
else{
    printf("It is not a leap Year");
}
i=10;
for(i=10;i<0;i--){
    for(j=0;j<=i;j++){
        printf("*\t");
    }
    printf("\n");
}



}
