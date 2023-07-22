#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(long long n) {
    long temp = n;
    int m = 1;
    while(temp>=10){
        temp = temp/10;
        m++;
    }
    // 리턴할 값은 메모리를 동적 할당해주세요.
    int* answer = (int*)malloc(sizeof(int)*m);
    for (int i = 0; i < m; i++){
        answer[i]=n%10;
        n = n/10;
        printf("%d",answer[i]);
    }

    return answer;
    free(answer);
}

int main(){
    int n;
    scanf("%d", &n);
    solution(n);
}