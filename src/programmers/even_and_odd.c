#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int num) {
    int count;
    if(num%2 == 0){
        count = 4;
    }else{
        count = 3;
    }
    char* answer = (char*)malloc(sizeof(char)*count);
    if(count == 4){
        answer = "Even";
    }else{
        answer = "Odd";
    }

    return answer;
    free(answer);
}