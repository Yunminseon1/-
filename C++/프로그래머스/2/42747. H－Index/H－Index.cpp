#include <vector>
#include <algorithm>
#include <iostream>

int solution(std::vector<int> citations) {
    // 내림차순 정렬
    std::sort(citations.begin(), citations.end(), std::greater<int>());
    
    // 조건을 만족하는 h 찾기
    int h = 0;
    for (int i = 0; i < citations.size(); ++i) {
        if (citations[i] >= i + 1) {
            h = i + 1;
        } else {
            break;
        }
    }
    return h;
}

int main() {
    // 테스트 케이스
    std::vector<int> citations = {3, 0, 6, 1, 5};
    std::cout << solution(citations) << std::endl; // 출력: 3
    return 0;
}
