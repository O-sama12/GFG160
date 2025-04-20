#include<bits/stdc++.h>
using namespace std;
class stobuyonetran{
public:
    static int maxProfit(vector<int> &prices) {
        int initialPrices = prices[0], res = 0;
        for (int i = 0; i < prices.size(); i++)
        {
            initialPrices = min(initialPrices, prices[i]);
            res = max(res, prices[i] - initialPrices);
        }
        return res;
    }
};
int main() {
    vector<int> prices = {7, 10, 1, 3, 6, 9, 2};
    cout << stobuyonetran::maxProfit(prices) << endl;
    return 0;
}