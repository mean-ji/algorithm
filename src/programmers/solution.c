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

long long add(int a, int b) {
    long long answer = 0;
    if(a>b){
        for(int i = b; i <=a ; i++)
            answer+=i;
    }
    else if(a<b){
        for(int i = a; i <= b; i++)
            answer+=i;
    }
    else
        answer = a;
    return answer;
}

char* subak(int n) {
    char* a="수";
    char* b="박";

    // 리턴할 값은 메모리를 동적 할당해주세요.
    char* answer = (char*)malloc(sizeof(b)*n);
    strcpy(answer, a);
    for (int i = 1; i < n ; i++){
        if(i%2 == 0){
            strcat(answer, a);
        }else{
            strcat(answer, b);
        }


    }
    printf("%s",answer);

    return answer;

    free(answer);
}

int main(){
    int a , b;
    printf("2016년 a월 b일을 구해봅시다!!");
    scanf("%d %d",&a,&b);

    char* ans;

    ans = solution(a, b);
    free(ans);
    printf(" %s ", ans);

    int n;
    printf("수박을 n번 출력!!");
    scanf("%d", &n);
    solution(n);

}