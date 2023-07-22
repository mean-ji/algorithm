#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int c[3000] = {0,};

    for(int i = n; i > 0; i --){
        if(n%i == 0)
            c[i] = i;
    }
    int answer = 0;
    for(int i = 0; i < 3000 ; i++){
        answer = answer + c[i];
    }
    return answer;
}

int main(){
    int n;
    printf("약수의 합을 구합시당다라당당");
    scanf("%d", &n);
    solution(n);
}