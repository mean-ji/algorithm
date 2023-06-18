#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>

char* solution(int a, int b) {
    // 리턴할 값은 메모리를 동적 할당해주세요.
    int c;


    switch(a){
        case 1 : b = b; break;
        case 2 : b = b+31; break;
        case 9 :  b = b + 1+(((a/2)*31)+(((a-1)/2)*30-1)); break;
        case 10 : b = b + 1+(((a/2)*31)+(((a-1)/2)*30-1)); break;
        case 11 : b = b + 1+(((a/2)*31)+(((a-1)/2)*30-1)); break;
        case 12 : b = b + 1+(((a/2)*31)+(((a-1)/2)*30-1)); break;
        default: b = b + (((a/2)*31)+(((a-1)/2)*30-1)); break;
    }
    c = b % 7;

    char* answer = (char*)malloc(sizeof(char)*10);

    switch(c){
        case 1: strcpy(answer,"FRI"); break;
        case 2: strcpy(answer,"SAT"); break;
        case 3: strcpy(answer,"SUN"); break;
        case 4: strcpy(answer,"MON"); break;
        case 5: strcpy(answer,"TUE"); break;
        case 6: strcpy(answer,"WED"); break;
        case 0: strcpy(answer,"THU"); break;
        default : break;
    }

    return answer;
}

int main(){
    int a , b;
    printf("2016년 a월 b일을 구해봅시다!!");
    scanf("%d %d",&a,&b);

    char* ans;

    ans = solution(a, b);
    free(ans);
    printf(" %s ", ans);

}