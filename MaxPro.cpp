#include<bits/stdc++.h>
using namespace std;
class maxPro {
public:
    static int maxProfit(vector<int>& prices) {
        int n = prices.size(), res = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
};
int main() {
    vector<int> prices = {1, 3, 55, 7, 84, 839, 938};
    int res = MaxPro::maxProfit(prices);
    cout << res << endl;
    return 0;
}
