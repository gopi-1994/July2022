#include<stdio.h>
int main(){

//   using while loop
    {int i=1;
while(i<10){
    int j=0;
    while(j<i)
    {
        printf("*\t");
        j++;
    }
    printf("\n");
    i++;
}
    }
int i=10;
while(i>0){
    int j=0;
    while(j<i)
    {
        printf("*\t");
        j++;
    }
    printf("\n");
    i--;
}

}
