#include <stdio.h>

int main(void) {
    int a;
    scanf("%d", &a);
    printf("%d is ", a);
    printf((a%2)?"odd":"even");

    return 0;
}