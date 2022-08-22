#include<stdio.h>

typedef struct studDetails{int no; char name[50]; int age} stud;

int main(){

   stud s1={1,"nameis",22};
   stud  s2={2,"boyss",23};
    printf("%d. %s\t%d\n",s1.no,s1.name,s1.age);
    printf("%d. %s\t%d\n",s2.no,s2.name,s2.age);

}
