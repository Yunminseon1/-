#include <stdio.h>
#include <string.h>

int solution(const char* message) {
    // 문자열의 길이를 계산
    int length = strlen(message);
    
    // 각 글자의 가로 크기가 2cm이므로 길이에 2를 곱함
    return length * 2;
}

int main() {
    // 예제 메시지
    const char* message = "Happy Birthday!";
    
    // solution 함수 호출
    int result = solution(message);
    
    // 결과 출력
    printf("Required paper width: %d cm\n", result);
    
    return 0;
}
