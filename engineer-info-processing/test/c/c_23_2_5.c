#include <stdio.h>
char n[30];
char *nero(){
    gets(n);
    return n;
}
int main(){
    char *p1 = nero();
    char *p2 = nero();
    char *p3 = nero();
    printf("%s\n", p1);
    printf("%s\n", p2);
    printf("%s\n", p3);

    return 0;
}