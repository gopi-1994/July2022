#include<stdio.h>
struct addre {int doorno; char flatname[50]};
struct studDeta{int no; char name[30]; int age; struct addre ad};
void main(){
   struct studDeta stud;
printf("enter the emp details");
scanf("%d %s %d %d %t",&stud.no,&stud.name,&stud.age,&stud.ad.doorno,&stud.ad.flatname);
information(stud);
}
void information(struct studDeta stud){
printf("prtinting the details...\n");
printf("%d %s %d %d %t",stud.no,stud.name,stud.age,stud.ad.doorno,stud.ad.flatname);

}

