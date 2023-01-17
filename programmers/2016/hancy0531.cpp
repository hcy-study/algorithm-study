#include <iostream>
#include <string>
using namespace std;

string solution(int a, int b) {
    string answer = "";
    int sum = 0;

    string day[7] = { "FRI","SAT","SUN","MON","TUE","WED","THU" };
    int month[12] = { 31,29,31,30,31,30,31,31,30,31,30,31 };

    if (a < 1 || a>12)
        return answer;
    if (b > month[a])
        return answer;

    for (int i = 0; i < a - 1; i++)
        sum += month[i];
    sum += b - 1;
    answer = day[sum % 7];

    return answer;
}