#include<stdio.h>

float var, percentage;
int count=1;

int main(){
printf("Enter a number...");
scanf("%f",&var);
var = var/100;
getPercen();
printf("\n");
return 0;

}

// recursion program
int getPercen(){
    if(count==101){
    return 1;
    }
    percentage = var * count;
    printf("%3d percent = %.2f\n",count,percentage);
    count++;
    getPercen();// calling the own function-- recursion
    return 0;

    }
