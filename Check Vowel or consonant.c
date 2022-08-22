#include<stdio.h>
#include<ctype.h>
int main(){
char c;
int lowercase, uppercase;
printf("Enter an alphabet : ");
scanf("%c",&c);
lowercase =(c == 'a' ||c=='e'||c=='i'||c=='o'||c=='u');
uppercase=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
if(!isalpha(c))
    printf("It is not an alphabet");
else if(lowercase || uppercase)
    printf("It is Vowel");
    else
    printf("It is Consonant");

}
