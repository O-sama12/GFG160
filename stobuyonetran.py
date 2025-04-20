class stobuyonetran:
    @staticmethod
    def maxProfit(self, prices):
        initial_Price = res = 0
        for price in prices:
            initial_Price = min(initial_Price, price)
            res  = max(res, price - initial_Price)
        return res
if __name__ == "__main__":
    prices = [7, 10, 1, 3, 6, 9, 2]
    print(stobuyonetran(prices))
