#include<stdio.h>
int main(){
const int max = 100;
int i, num, average, sum=0;
for(i=1; i<=max; ++i){
    printf("%d. Enter number less than 100 : ", i);
    scanf("%d",&num);
    if(num< 0){
        goto jump;// jump funtion
    }
    sum += num;
}
   jump:  average= sum/(i-1);
        printf("Sum of num : %d",sum);
        printf("Average of num : %d",average);

return 0;
}
