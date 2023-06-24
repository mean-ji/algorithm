#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int n) {
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
    int n;
    printf("수박을 n번 출력!!");
    scanf("%d", &n);
    solution(n);
}