#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool solution(int x) {
    int temp = x;
    int sum = 0;
    bool answer = true;
    while(x>=10){
        sum += x%10;
        x = x/10;

    }
    sum+= x;
    if(temp%sum==0){
        answer = true;
    }else{
        answer = false;
    }


    return answer;
}